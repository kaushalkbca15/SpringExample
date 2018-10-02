package com.kk.google.GoogleTransalateApps;

import java.util.Arrays;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.translate.Translate;
import com.google.api.services.translate.model.TranslationsListResponse;
import com.google.api.services.translate.model.TranslationsResource;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	 Translate t = new Translate.Builder(
                 GoogleNetHttpTransport.newTrustedTransport()
                 , GsonFactory.getDefaultInstance(), null)
                 // Set your application name
                 .setApplicationName("testapps")
                 .build();
         Translate.Translations.List list = t.new Translations().list(
                 Arrays.asList(
                         // Pass in list of strings to be translated
                         "Hello World",
                         "How to use Google Translate from Java"),
                 // Target language
                 "ES");

         // TODO: Set your API-Key from https://console.developers.google.com/
         list.setKey("AIzaSyB0tgz_ePlSKdjO-P1Xg5KVe3oYTnUd34Q");
         TranslationsListResponse response = list.execute();
         for (TranslationsResource translationsResource : response.getTranslations())
         {
             System.out.println(translationsResource.getTranslatedText());
         }
     }
}
