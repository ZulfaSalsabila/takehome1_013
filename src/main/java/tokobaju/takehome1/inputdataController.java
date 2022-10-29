/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobaju.takehome1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ROG
 */
@Controller
public class inputdataController {
    
    input data = new input();
    @RequestMapping("/uniqlo")
    public String Input(@RequestParam(value="Name") String nama,
                        @RequestParam(value="Banyak") String jumlah,
                        @RequestParam(value="Total") String Harga,
                        Model model){
        int item, satuan, totalBelanja, diskon, totalHarga;
        
        item = Integer.parseInt(jumlah);
        satuan = Integer.parseInt(Harga);
        
        totalBelanja = data.totalBelanja(satuan, item);
        totalHarga = data.diskon(satuan, item);
        diskon = data.Getdiskon(satuan, item);
       
        model.addAttribute("name", nama);
        model.addAttribute("banyak", item);
        model.addAttribute("total", satuan);
        model.addAttribute("totalbelanja", totalBelanja);
        model.addAttribute("totalharga", totalHarga);
        model.addAttribute("diskon", diskon);
        
        return "NotaBelanja";
    }
    
}
