package com.nbs.nucleosnucleo.view

interface ErrorableView {
    fun showError(errorMessage: String)
    fun hideError()
    fun isErrorShowing(): Boolean
}