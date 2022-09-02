package net.mpsland.studentlogin;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class download extends AppCompatActivity {
    public DownloadManager dm, dm1, dm2, dm3, dm4, dm5;
    long Down, Down1, Down2, Down3, Down4, Down5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
    }

    public void Down(View view) {
        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("http://mm2021.000webhostapp.com/mrptb/sample.3gp");
        DownloadManager.Request r = new DownloadManager.Request(uri);
        r.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        Down = dm.enqueue(r);
    }

    public void Down1(View view) {
        dm1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://id-static.z-dn.net/files/dd5/6efd7f03069915923918d9cee4d4f45a.jpg");
        DownloadManager.Request r = new DownloadManager.Request(uri);
        r.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        Down1 = dm1.enqueue(r);
    }

    public void Down2(View view) {
        dm2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://cdn1.byjus.com/wp-content/uploads/2020/09/Integral-fomrulas-list.png");
        DownloadManager.Request r = new DownloadManager.Request(uri);
        r.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        Down2 = dm2.enqueue(r);
    }

    public void Down3(View view) {
        dm3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://www.dummies.com/wp-content/uploads/250709.image0.jpg");
        DownloadManager.Request r = new DownloadManager.Request(uri);
        r.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        Down3 = dm3.enqueue(r);
    }

    public void Down4(View view) {
        dm4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://rr2---sn-npoeene6.googlevideo.com/videoplayback?expire=1639346601&ei=SB22Yb_2N5qulu8PjdSu4AE&ip=173.245.202.154&id=o-ADjKip_FfupjzqhrhqtZ0ZVrvv761WbIqK_QqURrOVqX&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=kBa4GCKRRFRQEEP2y0obg18G&cnr=14&ratebypass=yes&dur=300.048&lmt=1636017885181176&fexp=24001373,24007246&c=WEB&txp=2210224&n=Ub1N3Adw_K5roA&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAJgHYeU-kmcpKZ3S6Z1rVxlHiBrovbvLIgRGGpT1SCM7AiEAv2-lQl41-1qSbTd4eQuCZIgywKZiPxdBUcG2CU1AimY%3D&redirect_counter=1&cm2rm=sn-vgqee77l&req_id=ed5db742bbd1a3ee&cms_redirect=yes&mh=EA&mip=114.141.50.218&mm=34&mn=sn-npoeene6&ms=ltu&mt=1639324598&mv=m&mvi=2&pl=24&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgJAir8CKFeHdZUkxgXR6E9WvCsTPLFCisLVZ0g2huxF0CIGqzleCOvisujeJ0B5HAkAHtOMkr-75BYf_qQRZD-4kM");
        DownloadManager.Request r = new DownloadManager.Request(uri);
        r.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        Down4 = dm4.enqueue(r);
    }

    public void Down5(View view) {
        dm5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://i.pinimg.com/originals/28/3a/11/283a115c1cc771edc8fe118067ee1089.png");
        DownloadManager.Request r = new DownloadManager.Request(uri);
        r.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        Down5 = dm5.enqueue(r);
    }
}
