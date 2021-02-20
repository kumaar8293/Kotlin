package com.oops

interface MyClickListener {
    var name: String     // Properties are by default abstract
    fun onClick() {     // In case of Interface nothing is final, Everything is open in nature
        println("MyClickListener :OnClick") //Normal methods are public and open in Nature not FINAL.
    }

    fun onTouch()
}

interface MySecondListener {
    fun onClick() {
        println("MySecondListener :onClick")
    }

    fun onTouch() {
        println("MySecondListener :onTouch")
    }
}

class MyButton : MyClickListener, MySecondListener {
    override var name: String = "dummy_name"

    override fun onTouch() {
        super.onTouch()
    }

    override fun onClick() {
        super<MyClickListener>.onClick()
        super<MySecondListener>.onClick()
    }
}