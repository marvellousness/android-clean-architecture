package com.marcobrenes.githubtrending.presentation.state

class Resource<out T> constructor(
        val status: ResourceState,
        val data: T? = null,
        val message: String? = null)