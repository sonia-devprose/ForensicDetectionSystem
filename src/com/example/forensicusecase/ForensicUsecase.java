package com.example.forensicusecase;

// Base class Imaging
class Imaging
{
    protected String imageSource;
    protected String imageFormat;

    public Imaging (String imageSource, String imageFormat)
    {
        this.imageSource = imageSource;
        this.imageFormat = imageFormat;
    }

    // Getter methods
    public String getImageSource()
    {
        return imageSource;
    }

    public String getImageFormat()
    {
        return imageFormat;
    }

    // Setter methods
    public void setImageSource(String imageSource)
    {
        this.imageSource = imageSource;
    }
    public void setImageFormat(String imageFormat)
    {
        this.imageFormat = imageFormat;
    }
    public void captureImage()
    {
        System.out.println("Capturing image source: " + imageSource + " in image format: " +imageFormat);
    }
    // Method to override
    public void displayImage()
    {
        System.out.println("Displaying image from source: " +imageSource);
    }

}

class Imaging3D extends Imaging
{
    protected int depth;
    public Imaging3D(String imageSource, String imageFormat, int depth)
    {
        super(imageSource, imageFormat);
        this.depth = depth;
    }

    public int getDepth()
    {
        return depth;
    }

    public void setDepth(int depth)
    {
        this.depth=depth;
    }

    public void generate3DImage()
    {
        System.out.println("3D image generated from the depth: " +depth);
    }

    @Override
    public void displayImage()
    {
        System.out.println("Displaying image from source: " +imageSource + " and depth: " +depth);
    }

}

class Forensic3DImaging extends Imaging3D
{
    protected String crimeSceneDetails;
    public Forensic3DImaging(String imageSource, String imageFormat, int depth, String crimeSceneDetails)
    {
        super(imageSource, imageFormat, depth);
        this.crimeSceneDetails = crimeSceneDetails;
    }

    public String getCrimeSceneDetails() {
        return crimeSceneDetails;
    }

    public void setCrimeSceneDetails( String crimeSceneDetails)
    {
        this.crimeSceneDetails = crimeSceneDetails;
    }
    public void analyzeForensicImage() {
        System.out.println("Analyzing forensic 3D image of crime scene: " + crimeSceneDetails);
        System.out.println("Using advanced algorithms to detect abnormalities.");
    }
    @Override
    public void displayImage()
    {
        super.displayImage();
        System.out.println("Displaying image from crime scene details: " + crimeSceneDetails);
    }

}

public class ForensicUsecase {

    public static void main(String[] args)
    {
        Forensic3DImaging forensic3DImaging = new Forensic3DImaging("Crime scene 1", "JPG", 5, "Gunshot wound analysis");
        forensic3DImaging.generate3DImage();
        forensic3DImaging.captureImage();
        forensic3DImaging.analyzeForensicImage();
        forensic3DImaging.captureImage();
    }
}
