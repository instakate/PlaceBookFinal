package com.raywenderlich.placebook.util

import android.content.Context
import java.io.File

// Utility method deletes single file in main files directory
object FileUtils {
    fun deleteFile(context: Context, filename: String) {
        val dir = context.filesDir
        val file = File(dir, filename)
        file.delete()
    }
}