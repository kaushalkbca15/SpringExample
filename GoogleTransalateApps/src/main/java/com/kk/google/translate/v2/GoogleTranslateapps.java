package com.kk.google.translate.v2;

import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
public class GoogleTranslateapps {
	 public static void main(String[] args) {
		 Translate translate = TranslateOptions.defaultInstance().service();

		    // Text of an "unknown" language to detect and then translate into English
		    final String mysteriousText = "Hola Mundo";

		    // Detect the language of the mysterious text
		    Detection detection = translate.detect(mysteriousText);
		    String detectedLanguage = detection.language();

		    // Translate the mysterious text to English
		    Translation translation = translate.translate(
		        mysteriousText,
		        TranslateOption.sourceLanguage(detectedLanguage),
		        TranslateOption.targetLanguage("en"));

		    System.out.println(translation.translatedText());
	}
}
