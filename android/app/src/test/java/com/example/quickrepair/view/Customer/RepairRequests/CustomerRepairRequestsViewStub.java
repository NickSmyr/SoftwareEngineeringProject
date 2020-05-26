package com.example.quickrepair.view.Customer.RepairRequests;

import com.example.quickrepair.view.Technician.RepairRequests.TechnicianRepairRequestsPresenter;

public class CustomerRepairRequestsViewStub implements CustomerRepairRequestsView
{
    private static int currentRepairRequestUid = 0;
    private static int currentState = 0;

    private static final int UNCONFIRMED = 1;
    private static final int CONFIRMED = 2;
    private static final int COMPLETED = 3;

    private static boolean pressEdit = false;
    private static boolean pressSearch = false;
    private static boolean error = false;
    private static TechnicianRepairRequestsPresenter technicianRepairRequestsPresenter;

    @Override
    public void returnRepairRequestUnconfirmed(int repairRequestUid)
    {
        currentState = UNCONFIRMED;
        currentRepairRequestUid = repairRequestUid;
        pressEdit = false;
    }

    @Override
    public void returnRepairRequestConfirmed(int repairRequestUid)
    {
        currentState = CONFIRMED;
        currentRepairRequestUid = repairRequestUid;
        pressEdit = false;
    }

    @Override
    public void returnRepairRequestCompleted(int repairRequestUid)
    {
        currentState = COMPLETED;
        currentRepairRequestUid = repairRequestUid;
        pressEdit = false;
    }

    @Override
    public void editData()
    {
        pressEdit = true;
    }

    @Override
    public void search()
    {
        pressSearch = true;
    }

    @Override
    public void showError(String message)
    {
        error = true;
    }

    public int getCurrentRepairRequestUid()
    {
        return currentRepairRequestUid;
    }

    public int getCurrentState()
    {
        return currentState;
    }

    public static boolean getPressEdit()
    {
        return pressEdit;
    }

    public static boolean isError()
    {
        return error;
    }

    public static boolean isPressSearch()
    {
        return pressSearch;
    }
}
