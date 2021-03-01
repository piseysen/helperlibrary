package com.vb.helperlibrary.utils

import com.google.gson.Gson
import com.google.gson.JsonParser
import org.json.JSONObject

class DataConverter {
    companion object {
        fun convertJsonStringToObject(jsonObject: JSONObject, clazz: Class<*>): Any {
            try {
                val mJson = JsonParser.parseString(jsonObject.toString())
                return Gson().fromJson(mJson, clazz)
            } catch (e: Exception) {
                throw Exception("")
            }
        }

        fun convertJsonStringToObject(mJson: String, clazz: Class<*>): Any {
            try {
                return Gson().fromJson(mJson, clazz)
            } catch (e: Exception) {
                throw Exception("")
            }

        }

        fun objectItemToJsonStringConvert(data: Any): String {
            try {
                return Gson().toJson(data)
            } catch (e: Exception) {
                throw Exception("")
            }
        }
    }
}