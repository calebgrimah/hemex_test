package com.sample.unmc.hemex.controller

import com.sample.unmc.hemex.model.PatienData
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class PatientController {



    @PostMapping("/PatientResults/find")
    fun getPatientData() : String{
        return "{\n" +
                "  \"TotalResults\": 3,\n" +
                "  \"ResultsPerPage\": 100,\n" +
                "  \"ResultsPage\": 1,\n" +
                "  \"Results\": [\n" +
                "    {\n" +
                "      \"PatientID\": \"1-001-0003-002-002\",\n" +
                "      \"Site\": \"N/A\",\n" +
                "      \"Results\": [\n" +
                "        {\n" +
                "          \"TestID\": 11,\n" +
                "          \"DeviceID\": \"Alpha3B\",\n" +
                "          \"Type\": \"SCD\",\n" +
                "          \"Time\": \"18:59 PM\",\n" +
                "          \"Date\": \"2019-10-02\",\n" +
                "          \"Interpretation\": \"slow_start & low_current & roi_not_nominal\",\n" +
                "          \"Note\": \"\",\n" +
                "          \"Phenotype\": \"Retest\",\n" +
                "          \"SCDBand\": [\n" +
                "            {\n" +
                "              \"HbType\": \"A2\\nC\\nE\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"S\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"F\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"A\",\n" +
                "              \"Percentage\": 0\n" +
                "            }\n" +
                "          ],\n" +
                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"PatientID\": \"1-050-0003-002-002\",\n" +
                "      \"Site\": \"Site 2\",\n" +
                "      \"Results\": [\n" +
                "        {\n" +
                "          \"TestID\": 13,\n" +
                "          \"DeviceID\": \"Alpha 3-D03\",\n" +
                "          \"Type\": \"SCD\",\n" +
                "          \"Time\": \"08:47 AM\",\n" +
                "          \"Date\": \"2019-07-27\",\n" +
                "          \"Interpretation\": \"N/A\",\n" +
                "          \"Note\": \"This is a sample note of what the API would return.\",\n" +
                "          \"Phenotype\": \"N/A\",\n" +
                "          \"SCDBand\": [\n" +
                "            {\n" +
                "              \"HbType\": \"A2\\nC\\nE\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"S\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"F\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"A\",\n" +
                "              \"Percentage\": 0\n" +
                "            }\n" +
                "          ],\n" +
                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/5f754a3a05b74b5e9db2ee119cabcefc.png\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"TestID\": 1,\n" +
                "          \"DeviceID\": \"Alpha 3-D03\",\n" +
                "          \"Type\": \"SCD\",\n" +
                "          \"Time\": \"08:00 AM\",\n" +
                "          \"Date\": \"2019-06-27\",\n" +
                "          \"Interpretation\": \"N/A\",\n" +
                "          \"Note\": \"\",\n" +
                "          \"Phenotype\": \"N/A\",\n" +
                "          \"SCDBand\": [\n" +
                "            {\n" +
                "              \"HbType\": \"A2\\nC\\nE\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"S\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"F\",\n" +
                "              \"Percentage\": 0\n" +
                "            },\n" +
                "            {\n" +
                "              \"HbType\": \"A\",\n" +
                "              \"Percentage\": 0\n" +
                "            }\n" +
                "          ],\n" +
                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/fd52823f0ba1495d859f9653ff9f553a.png\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"PatientID\": \"1-001-0003-010-002\",\n" +
                "      \"Site\": \"Site 2\",\n" +
                "      \"Results\": [\n" +
                "        {\n" +
                "          \"TestID\": 10,\n" +
                "          \"DeviceID\": \"Alpha3B\",\n" +
                "          \"Type\": \"Malaria\",\n" +
                "          \"Time\": \"18:53 PM\",\n" +
                "          \"Date\": \"2019-10-02\",\n" +
                "          \"Interpretation\": \"N/A\",\n" +
                "          \"Note\": \"PATIENT PRESENT WITH FEVER\",\n" +
                "          \"Phenotype\": \"N/A\",\n" +
                "          \"SCDBand\": [],\n" +
                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/c1fd837d69f54eb99cc260c273a533a2.png\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}"
    }

    @PostMapping("/hello")
    fun hello() : String{
        return "Hello World"
    }

    @PostMapping("/Users/authorize")
    fun tokenString() : String{
        return "{\n" +
                "    \"access_token\": \"YOLO\"\n" +
                "}"
    }
}