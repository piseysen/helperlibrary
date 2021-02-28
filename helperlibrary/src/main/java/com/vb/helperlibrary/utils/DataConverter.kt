package com.vb.helperlibrary.utils

import com.google.gson.Gson
import com.google.gson.JsonParser
import org.json.JSONObject

class DataConverter {
    companion object {
        fun convertJsonStringToObject(jsonObject: JSONObject, clazz: Class<*>): Any {
            val mJson = JsonParser.parseString(jsonObject.toString())
            return Gson().fromJson(mJson, clazz)
        }

        fun convertJsonStringToObject(mJson: String, clazz: Class<*>): Any {
            return Gson().fromJson(mJson, clazz)
        }

        fun objectItemToJsonStringConvert(data: Any): String {
            return Gson().toJson(data)
        }
    }
}