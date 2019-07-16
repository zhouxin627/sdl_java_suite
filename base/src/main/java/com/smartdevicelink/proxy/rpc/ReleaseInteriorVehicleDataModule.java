package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;
import com.smartdevicelink.proxy.rpc.enums.ModuleType;

import java.util.Hashtable;
import java.util.List;

public class ReleaseInteriorVehicleDataModule extends RPCRequest {
    public static final String KEY_MODULE_TYPE = "moduleType";
    public static final String KEY_MODULE_ID = "moduleId";

    public ReleaseInteriorVehicleDataModule() {
        super(FunctionID.RELEASE_INTERIOR_VEHICLE_MODULE.toString());
    }

    public ReleaseInteriorVehicleDataModule(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the Module Type for this class
     * @param type the Module Type to be set
     */
    public void setModuleType(ModuleType type) {
        setParameters(KEY_MODULE_TYPE, type);
    }

    /**
     * Gets the Module Type of this class
     * @return the Module Type of this class
     */
    public ModuleType getModuleType() {
        return (ModuleType) getObject(ModuleType.class, KEY_MODULE_TYPE);
    }

    /**
     * Sets the Module Ids for this class
     * @param id the ids to be set
     */
    public void setModuleId(String id) {
        setParameters(KEY_MODULE_ID, id);
    }

    /**
     * Gets the Module Id of this class
     * @return the Module Ids
     */
    public String getModuleIds() {
        return getString(KEY_MODULE_ID);
    }
}
