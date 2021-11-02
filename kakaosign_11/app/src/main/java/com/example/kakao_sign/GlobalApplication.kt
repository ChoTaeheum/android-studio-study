package com.example.kakao_sign

import android.app.Application
import com.kakao.sdk.common.KakaoSdk
import com.nhn.android.naverlogin.OAuthLogin
import android.content.Context

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "655ef29e1945cd1ee004060952258a5b")

    }
}