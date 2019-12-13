package com.sample.unmc.hemex.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class PatientController {



    @PostMapping("/PatientResults/find")
    fun getPatientData() : String{
//        return "{\n" +
//                "  \"TotalResults\": 3,\n" +
//                "  \"ResultsPerPage\": 100,\n" +
//                "  \"ResultsPage\": 1,\n" +
//                "  \"Results\": [\n" +
//                "    {\n" +
//                "      \"PatientID\": \"1-001-0003-002-002\",\n" +
//                "      \"Site\": \"N/A\",\n" +
//                "      \"Results\": [\n" +
//                "        {\n" +
//                "          \"TestID\": 11,\n" +
//                "          \"DeviceID\": \"Alpha3B\",\n" +
//                "          \"Type\": \"SCD\",\n" +
//                "          \"Time\": \"18:59 PM\",\n" +
//                "          \"Date\": \"2019-10-02\",\n" +
//                "          \"Interpretation\": \"slow_start & low_current & roi_not_nominal\",\n" +
//                "          \"Note\": \"\",\n" +
//                "          \"Phenotype\": \"Retest\",\n" +
//                "          \"SCDBand\": [\n" +
//                "            {\n" +
//                "              \"HbType\": \"A2\\nC\\nE\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"S\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"F\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"A\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"PatientID\": \"1-050-0003-002-002\",\n" +
//                "      \"Site\": \"Site 2\",\n" +
//                "      \"Results\": [\n" +
//                "        {\n" +
//                "          \"TestID\": 13,\n" +
//                "          \"DeviceID\": \"Alpha 3-D03\",\n" +
//                "          \"Type\": \"SCD\",\n" +
//                "          \"Time\": \"08:47 AM\",\n" +
//                "          \"Date\": \"2019-07-27\",\n" +
//                "          \"Interpretation\": \"N/A\",\n" +
//                "          \"Note\": \"This is a sample note of what the API would return.\",\n" +
//                "          \"Phenotype\": \"N/A\",\n" +
//                "          \"SCDBand\": [\n" +
//                "            {\n" +
//                "              \"HbType\": \"A2\\nC\\nE\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"S\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"F\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"A\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/5f754a3a05b74b5e9db2ee119cabcefc.png\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"TestID\": 1,\n" +
//                "          \"DeviceID\": \"Alpha 3-D03\",\n" +
//                "          \"Type\": \"SCD\",\n" +
//                "          \"Time\": \"08:00 AM\",\n" +
//                "          \"Date\": \"2019-06-27\",\n" +
//                "          \"Interpretation\": \"N/A\",\n" +
//                "          \"Note\": \"\",\n" +
//                "          \"Phenotype\": \"N/A\",\n" +
//                "          \"SCDBand\": [\n" +
//                "            {\n" +
//                "              \"HbType\": \"A2\\nC\\nE\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"S\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"F\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"HbType\": \"A\",\n" +
//                "              \"Percentage\": 0\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/fd52823f0ba1495d859f9653ff9f553a.png\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"PatientID\": \"1-001-0002-010-002\",\n" +
//                "      \"Site\": \"Site 2\",\n" +
//                "      \"Results\": [\n" +
//                "        {\n" +
//                "          \"TestID\": 10,\n" +
//                "          \"DeviceID\": \"Alpha3B\",\n" +
//                "          \"Type\": \"Malaria\",\n" +
//                "          \"Time\": \"18:53 PM\",\n" +
//                "          \"Date\": \"2019-10-02\",\n" +
//                "          \"Interpretation\": \"N/A\",\n" +
//                "          \"Note\": \"PATIENT PRESENT WITH FEVER\",\n" +
//                "          \"Phenotype\": \"N/A\",\n" +
//                "          \"SCDBand\": [],\n" +
//                "          \"ImageURL\": \"https://hemex-staging.s3.amazonaws.com/resultImages/c1fd837d69f54eb99cc260c273a533a2.png\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}"

        return """
           {
  "TotalResults": 3,
  "ResultsPerPage": 100,
  "ResultsPage": 1,
  "Results": [
    {
      "PatientID": "47-001-0001-002-001",
      "Site": "N/A",
      "Results": [
        {
          "TestID": 11,
          "DeviceID": "Alpha3B",
          "Type": "SCD",
          "Time": "18:59 PM",
          "Date": "2019-10-02",
          "Interpretation": "slow_start & low_current & roi_not_nominal",
          "Note": "",
          "Phenotype": "Retest",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 0
            },
            {
              "HbType": "S",
              "Percentage": 0
            },
            {
              "HbType": "F",
              "Percentage": 0
            },
            {
              "HbType": "A",
              "Percentage": 0
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png"
        }
      ]
    },
    {
      "PatientID": "10010003002002",
      "Site": "N/A",
      "Results": [
        {
          "TestID": 11,
          "DeviceID": "Alpha3B",
          "Type": "SCD",
          "Time": "18:59 PM",
          "Date": "2019-10-02",
          "Interpretation": "slow_start & low_current & roi_not_nominal",
          "Note": "",
          "Phenotype": "Retest",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 0
            },
            {
              "HbType": "S",
              "Percentage": 0
            },
            {
              "HbType": "F",
              "Percentage": 0
            },
            {
              "HbType": "A",
              "Percentage": 0
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png"
        }
      ]
    },
    {
      "PatientID": "10010003002003",
      "Site": "N/A",
      "Results": [
        {
          "TestID": 11,
          "DeviceID": "Alpha3B",
          "Type": "SCD",
          "Time": "18:59 PM",
          "Date": "2019-10-02",
          "Interpretation": "slow_start & low_current & roi_not_nominal",
          "Note": "",
          "Phenotype": "Retest",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 0
            },
            {
              "HbType": "S",
              "Percentage": 0
            },
            {
              "HbType": "F",
              "Percentage": 0
            },
            {
              "HbType": "A",
              "Percentage": 0
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png"
        }
      ]
    },
    {
      "PatientID": "10010003002004",
      "Site": "N/A",
      "Results": [
        {
          "TestID": 11,
          "DeviceID": "Alpha3B",
          "Type": "SCD",
          "Time": "18:59 PM",
          "Date": "2019-10-02",
          "Interpretation": "slow_start & low_current & roi_not_nominal",
          "Note": "",
          "Phenotype": "Retest",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 0
            },
            {
              "HbType": "S",
              "Percentage": 0
            },
            {
              "HbType": "F",
              "Percentage": 0
            },
            {
              "HbType": "A",
              "Percentage": 0
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png"
        }
      ]
    },
    {
      "PatientID": "10010003002005",
      "Site": "Site 2",
      "Results": [
        {
          "TestID": 13,
          "DeviceID": "Alpha 3-D03",
          "Type": "SCD",
          "Time": "08:47 AM",
          "Date": "2019-07-27",
          "Interpretation": "N/A",
          "Note": "This is a sample note of what the API would return.",
          "Phenotype": "N/A",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 0
            },
            {
              "HbType": "S",
              "Percentage": 0
            },
            {
              "HbType": "F",
              "Percentage": 0
            },
            {
              "HbType": "A",
              "Percentage": 0
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/5f754a3a05b74b5e9db2ee119cabcefc.png"
        },
        {
          "TestID": 1,
          "DeviceID": "Alpha 3-D03",
          "Type": "SCD",
          "Time": "08:00 AM",
          "Date": "2019-06-27",
          "Interpretation": "N/A",
          "Note": "",
          "Phenotype": "N/A",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 0
            },
            {
              "HbType": "S",
              "Percentage": 0
            },
            {
              "HbType": "F",
              "Percentage": 0
            },
            {
              "HbType": "A",
              "Percentage": 0
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/fd52823f0ba1495d859f9653ff9f553a.png"
        }
      ]
    },
    {
      "PatientID": "10010003002006",
      "Site": "Site 2",
      "Results": [
        {
          "TestID": 10,
          "DeviceID": "Alpha3B",
          "Type": "Malaria",
          "Time": "18:53 PM",
          "Date": "2019-10-02",
          "Interpretation": "N/A",
          "Note": "High body temperature observed on patient.",
          "Phenotype": "N/A",
          "SCDBand": [],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/c1fd837d69f54eb99cc260c273a533a2.png"
        }
      ]
    },
    {
      "PatientID": "47-001-0002-009-002",
      "Site": "Site 2",
      "Results": [
        {
          "TestID": 10,
          "DeviceID": "Alpha3B",
          "Type": "Malaria",
          "Time": "18:53 PM",
          "Date": "2019-10-02",
          "Interpretation": "N/A",
          "Note": "PATIENT PRESENT WITH FEVER",
          "Phenotype": "N/A",
          "SCDBand": [],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/c1fd837d69f54eb99cc260c273a533a2.png"
        }
      ]
    },
    {
      "PatientID": "1-001-0003-003-002",
      "Site": "N/A",
      "Results": [
        {
          "TestID": 11,
          "DeviceID": "Alpha3B",
          "Type": "SCD",
          "Time": "18:59 PM",
          "Date": "2019-10-02",
          "Interpretation": "slow_start & low_current & roi_not_nominal",
          "Note": "Patient is Homozygous",
          "Phenotype": "AA",
          "SCDBand": [
            {
              "HbType": "A2\nC\nE",
              "Percentage": 12
            },
            {
              "HbType": "S",
              "Percentage": 8
            },
            {
              "HbType": "F",
              "Percentage": 4
            },
            {
              "HbType": "A",
              "Percentage": 76
            }
          ],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/52b2d2c207754ad3ad775dc708925a51.png"
        }
      ]
    },
    {
      "PatientID": "1-001-0003-006-001",
      "Site": "Site 2",
      "Results": [
        {
          "TestID": 10,
          "DeviceID": "Alpha3B",
          "Type": "Malaria",
          "Time": "10:13 AM",
          "Date": "2019-11-02",
          "Interpretation": "N/A",
          "Note": "Patient present with fever",
          "Phenotype": "N/A",
          "SCDBand": [],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/c1fd837d69f54eb99cc260c273a533a2.png"
        }
      ]
    },
    {
      "PatientID": "1-001-0003-006-002",
      "Site": "Site 2",
      "Results": [
        {
          "TestID": 10,
          "DeviceID": "Alpha3B",
          "Type": "Malaria",
          "Time": "18:53 PM",
          "Date": "2019-10-02",
          "Interpretation": "N/A",
          "Note": "No Malaria present",
          "Phenotype": "N/A",
          "SCDBand": [],
          "ImageURL": "https://hemex-staging.s3.amazonaws.com/resultImages/c1fd837d69f54eb99cc260c273a533a2.png"
        }
      ]
    }
  ]
}
        """.trimIndent()
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
