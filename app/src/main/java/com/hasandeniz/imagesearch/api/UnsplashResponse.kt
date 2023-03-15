package com.hasandeniz.imagesearch.api

import com.hasandeniz.imagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
