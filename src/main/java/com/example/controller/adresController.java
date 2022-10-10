package com.example.controller;

import com.example.dao.AdresRepository;
import com.example.model.Adres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Controller
public class adresController {
@Autowired
    AdresRepository adresRepository;

    @ResponseBody
    @GetMapping("/adres")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/showEmployee?name=nico'>Show emplyee name :</a> <input type='text' name='name' id='name'></li>";
        html += " <li><a href='/createNico'>Create employee Nico</a></li>";
        html += " <li><a href='/deleteNico'>Delete employee Nico</a></li>";
        html += "</ul>";
        return html;
    }

    @ResponseBody
    @GetMapping("/showAllEmployee")
    public String showAllEmployee() {

        Iterable<Adres> adresses = this.adresRepository.findAll();

        String html = "";
        for (Adres adr : adresses) {
            html += "Nom: " + adr.getName() + "         Adresse: " + adr.getAdres() + "<br>";
        }
        html += " <li><a href='/adres'>return adres</a></li>";
        return html;
    }

    @ResponseBody
    @GetMapping("/showEmployee")
    public String showEmployee(@RequestParam String name) {

        Adres adr = this.adresRepository.findByName(name);

        String html = "";
        html += "Nom: " + adr.getName() + "         Adresse: " + adr.getAdres() + "<br>";
        html += " <li><a href='/adres'>return adres</a></li>";

        return html;
    }

    @ResponseBody
    @GetMapping("/createNico")
    public String createNico() {

        Adres adr = new Adres();
        adr.setName("Nico");
        adr.setAdres("Rue des Arbalettes");
        this.adresRepository.save(adr);

        String html = "Nico Cree </br>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/adres'>return adres</a></li>";

        return html;
    }

    @ResponseBody
    @GetMapping("/deleteNico")
    public String deleteNico() {

        Adres adr = new Adres();
        adr.setName("Nico");
        adr.setAdres("Rue A");
        this.adresRepository.delete(adr);

        String html = "Nico deleté </br>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/adres'>return adres</a></li>";


        return html;
    }
}
