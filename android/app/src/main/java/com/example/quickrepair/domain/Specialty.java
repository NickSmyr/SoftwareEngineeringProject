package com.example.quickrepair.domain;

import java.util.HashSet;
import java.util.Set;

public class Specialty
{
    private String name;

    private Set<JobType> jobTypes = new HashSet<JobType>();

    public Specialty()
    {
    }

    public Specialty(String name)
    {
        setName(name);
    }

    //GETTERS
    public String getName()
    {
        return name;
    }

    public Set<JobType> getJobTypes()
    {
        return new HashSet<>(jobTypes);
    }

    //SETTERS
    public void setName(String name)
    {
        if (name == null) throw new NullPointerException("Speciality name can not be null.");
        if (name.isEmpty()) throw new IllegalArgumentException("Speciality name can not be empty.");

        this.name = name;
    }

    public void addJobType(JobType jobType)
    {
        if (jobType == null) throw new NullPointerException("Job type can not be null.");

        jobTypes.add(jobType);
    }


    @Override
    public boolean equals(Object other)
    {
        if (other == null) return false;

        if (this == other) return true;

        if (!(other instanceof Specialty)) return false;

        if (!name.equals(((Specialty) other).getName())) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}