import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Toy {
    String name;
    int price;
    String ageRange;
    String specialAttribute;

    public Toy(String name, int price, String ageRange, String specialAttribute) {
        this.name = name;
        this.price = price;
        this.ageRange = ageRange;
        this.specialAttribute = specialAttribute;
    }
}