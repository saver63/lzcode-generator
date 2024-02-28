package com.yupi.maker;

//import com.yupi.maker.cli.CommandExecutor;


import com.yupi.maker.generator.main.GenerateTemplate;
import com.yupi.maker.generator.main.MainGenerator;
import com.yupi.maker.generator.main.ZipGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
//        GenerateTemplate generator = new MainGenerator();
        GenerateTemplate generator = new ZipGenerator();
        generator.doGenerate();

    }
}
