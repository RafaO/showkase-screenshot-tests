package me.vavra.showkase

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner
import com.facebook.testing.screenshot.ScreenshotRunner

class ScreenshotTestRunner : AndroidJUnitRunner() {

    override fun onCreate(arguments: Bundle) {
        ScreenshotRunner.onCreate(this, arguments)
        super.onCreate(arguments)
    }

    override fun finish(resultCode: Int, results: Bundle) {
        ScreenshotRunner.onDestroy()
        super.finish(resultCode, results)
    }
}