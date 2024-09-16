package org.example;

import com.assemblyai.api.AssemblyAI;
import com.assemblyai.api.resources.transcripts.types.Transcript;

public class Main {
    public static void main(String[] args) {

        AssemblyAI aai = AssemblyAI.builder()
                .apiKey("7a29b586ecf54bef8795dd3257201c5e")
                .build();

        String url = "https://drive.google.com/uc?export=download&id=1grr0DPvlQmKtb85mn-X2yqvxOOiUiTnZ";

        Transcript transcript = aai.transcripts().transcribe(url);

        System.out.println(transcript.getText());
    }
}