package com.example.quickrepair.view.Customer.ShowConfirmedRepairRequest;

public interface CustomerConfirmedRepairRequestView {
    /**
     * Προβάλει μήνυμα λάθους
     * @param message Το Μήνυμα λάθους
     */
    void showError(String message);

    /**
     * Εμφανίζει τη δουλειά
     * @param job Η δουλειά
     */
    void setJob(String job);

    /**
     * Εμφανίζει το όνομα του τεχνικού
     * @param technicianName Το όνομα του τεχνηκού
     */
    void setTechnicianName(String technicianName);

    /**
     * Εμφανίζει τη διεύθυνση
     * @param address Η διεύθυνση
     */
    void setAddress(String address);

    /**
     * Εμφανίζει τα σχόλια
     * @param comments Τα σχόλια
     */
    void setComments(String comments);

    /**
     * Εμφανίζει την ημερομηνία διεξαγωγής της επισκευής
     * @param conductionDate Η ημερομηνία διεξαγωγής  της επισκευής
     */
    void setConductionDate(String conductionDate);

    /**
     * Εμφανίζει το εκτιμώμενο απο τον τεχνικό χρόνο της επισκευής
     * @param estimatedDuration Ο εκτιμώμενος απο τον τεχνικό χρόνος της επισκευής
     */
    void setEstimatedDuration(String estimatedDuration);
}
