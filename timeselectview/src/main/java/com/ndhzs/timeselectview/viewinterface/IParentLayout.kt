package com.ndhzs.timeselectview.viewinterface

import android.view.ViewGroup

/**
 * @author 985892345
 * @email 2767465918@qq.com
 * @date 2021/4/12
 * @description [com.ndhzs.timeselectview.layout.ParentLayout]
 */
internal interface IParentLayout {
    fun addChildLayout(lp: ViewGroup.LayoutParams, v: ViewGroup, position: Int)
}