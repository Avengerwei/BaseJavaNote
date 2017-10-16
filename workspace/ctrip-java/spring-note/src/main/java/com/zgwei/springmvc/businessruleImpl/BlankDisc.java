package com.zgwei.springmvc.businessruleImpl;

import com.zgwei.springmvc.businessrule.CompanctDisc;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zgwei on 2017/9/9.
 */
@Component
public class BlankDisc implements CompanctDisc {
    private String title;
    private String artlist;

    private  BlankDisc(String title, String artlist){
        this.title = title;
        this.artlist = artlist;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtlist() {
        return artlist;
    }

    public void setArtlist(String artlist) {
        this.artlist = artlist;
    }


    @Override
    public void playTrack(int number) {
        System.out.println("Playing " + title +" by " + artlist + number);
        //tracks.forEach(track -> System.out.println("-Track: " + track));
    }
}
