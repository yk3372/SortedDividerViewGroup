package com.example.yukai.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;

import java.util.HashSet;

/**
 * 此类功能排序预先设定好key的View
 */
public abstract class SortedDividerViewGroup extends LinearLayout {

    private SparseArray<View> viewMap;
    private SparseArray<View> dividerMap;
    private HashSet<Integer> hideDividerSet;
    private int mTotalViewsCount;

    public SortedDividerViewGroup(Context context) {
        this(context, null);
    }

    public SortedDividerViewGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SortedDividerViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(HORIZONTAL);
        initData();
    }

    /**
     * 需要在使用前确定好会有多少个View可能会添加
     */
    private void initData() {
        final int count = getTotalViewCount();
        mTotalViewsCount = count;
        viewMap = new SparseArray<View>(count);
        dividerMap = new SparseArray<View>(count);
        hideDividerSet = new HashSet<Integer>(count);
    }

    /**
     * @return 返回可能会添加view的总数量
     */
    protected abstract int getTotalViewCount();

    /**
     * 指定位置的divider不可见
     * @param indexs
     */
    public void configNoDividerByIndex(int... indexs) {
        for (int index : indexs) {
            hideDividerSet.add(index);
        }
        refreshDividerVisibility();
    }

    /**
     * 添加特定位置的View
     * @param index begin 0
     * @param view  view to add
     */
    public void addIndexView(int index, View view) {
        if (viewMap.get(index) != null) {
            return;
        }
        int targetIndex = 0;
        for (int i = index - 1; i >= 0; i--) {
            if (viewMap.get(i) != null) {
                View tmpView = viewMap.get(i);
                targetIndex = indexOfChild(tmpView) + 1;//insert view blew the front child view
                break;
            }
        }
        viewMap.put(index, view);
        View dividerView = getDividerView(index);
        if (dividerView != null) {
            dividerView.setVisibility(View.GONE);
            addView(dividerView, targetIndex);
            dividerMap.put(index, dividerView);
            targetIndex++;
        }
        addView(view, targetIndex);
        refreshDividerVisibility();
    }

    protected abstract View getDividerView(int index);

    /**
     * 移除特定位置的View
     * @param index 要移除的view index
     */
    public void removeViewByIndex(int index) {
        View view = viewMap.get(index);
        View dividerView = dividerMap.get(index);
        if (view != null) {
            removeViewInLayout(view);
            viewMap.remove(index);
        }
        if (dividerView != null) {
            removeViewInLayout(dividerView);
            dividerMap.remove(index);
        }
        requestLayout();
        refreshDividerVisibility();
    }

    // 刷新当前已有的divider可见性
    private void refreshDividerVisibility() {
        boolean isFirstDivider = true;
        for (int i = 0; i < mTotalViewsCount; i++) {
            View view = dividerMap.get(i);
            if (view != null) {
                controlDividerToShow(isFirstDivider, i, view);
                isFirstDivider = false;
            }
        }
    }

    // 控制特定位置divider显示或隐藏
    private void controlDividerToShow(boolean isFirstDivider, int index, View view) {
        if (!isFirstDivider && !hideDividerSet.contains(index)) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }
}
