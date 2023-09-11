package excel.database.controller;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import excel.database.service.LibService;

@RestController
@RequestMapping("/lib")
public class ExcelController {
	@Autowired
	private LibService libService;
	
	@GetMapping("/books")
    public String book()
    {
        return "Available Books";
    }
	@PostMapping("/upload")
	public ResponseEntity<List<List<String>>> uploadExcel(@RequestParam("file") MultipartFile file) throws EncryptedDocumentException,IOException
	{
		libService.save(file);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
