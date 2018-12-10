/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfm.generador.json.de.historias;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Juanca
 */
public class QR {

    public void generarQR(String codigo, String nombreImg) {
        try {
            String filePath = "QR/"+nombreImg + ".png";
            String charset = "UTF-8";
            Map< EncodeHintType, ErrorCorrectionLevel> hintMap = new EnumMap< >(EncodeHintType.class);
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(new String(codigo.getBytes(charset), charset), BarcodeFormat.QR_CODE, 600, 600, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
            //System.out.println("QR Code image created successfully!"+filePath);
        } catch (WriterException | IOException e) {
            System.err.println(e);
        }
    }
}
