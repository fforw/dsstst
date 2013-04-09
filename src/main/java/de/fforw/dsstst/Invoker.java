package de.fforw.dsstst;

import java.io.File;

import de.quinscape.dss.runtime.CommandLineInterface;

public class Invoker
{
    public static void main(String[] args)
    {
        CommandLineInterface.main(new String[] { path("src/main/resources/test.dss"), path("target") });
    }

    private static String path(String path)
    {
        char sep = File.separatorChar;
        if (sep != '/')
        {
            return path.replace('/', sep);
        }
        return path;
    }
}
