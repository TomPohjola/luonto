package com.example.luonto.data.remote.firebase

class StorageManager {
    suspend fun uploadImage(localFilePath: String, spotId: String): Result<String> {
        return Result.success(localFilePath)
    }
    suspend fun deleteImage(spotId: String): Result<Unit> = Result.success(Unit)
}