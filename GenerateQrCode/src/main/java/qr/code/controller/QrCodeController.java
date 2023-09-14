package qr.code.controller;

import org.springframework.http.MediaType;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import qr.code.service.QrCodeService;

@RestController
@RequestMapping("/QR")
public class QrCodeController {

	@Autowired
    private QrCodeService qrCodeService;
   //https://online-barcode-reader.inliteresearch.com/(Scan the qr code using this site)
    @GetMapping(value = "/qrcode/{content}",produces =MediaType.IMAGE_PNG_VALUE)
    public byte[] generateQrCode(@PathVariable String content) throws IOException {
        int width = 200; 
        int height = 200; 
        return qrCodeService.generateQrCodeImage(content, width, height);
    }
}
