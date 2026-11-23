/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_PhysicalElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getSKU <em>SKU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getPoweredOn <em>Powered On</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getVendorEquipmentType <em>Vendor Equipment Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getUserTracking <em>User Tracking</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalElementImpl#getCanBeFRUed <em>Can Be FR Ued</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_PhysicalElementImpl extends CIM_ManagedSystemElementImpl implements CIM_PhysicalElement {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSKU() <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKU()
	 * @generated
	 * @ordered
	 */
	protected static final String SKU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKU() <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKU()
	 * @generated
	 * @ordered
	 */
	protected String sku = SKU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String partNumber = PART_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherIdentifyingInfo() <em>Other Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_IDENTIFYING_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIdentifyingInfo() <em>Other Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected String otherIdentifyingInfo = OTHER_IDENTIFYING_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoweredOn() <em>Powered On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoweredOn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean POWERED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoweredOn() <em>Powered On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoweredOn()
	 * @generated
	 * @ordered
	 */
	protected Boolean poweredOn = POWERED_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected String manufactureDate = MANUFACTURE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorEquipmentType() <em>Vendor Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorEquipmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EQUIPMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorEquipmentType() <em>Vendor Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorEquipmentType()
	 * @generated
	 * @ordered
	 */
	protected String vendorEquipmentType = VENDOR_EQUIPMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserTracking() <em>User Tracking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTracking()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_TRACKING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserTracking() <em>User Tracking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTracking()
	 * @generated
	 * @ordered
	 */
	protected String userTracking = USER_TRACKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanBeFRUed() <em>Can Be FR Ued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeFRUed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_BE_FR_UED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanBeFRUed() <em>Can Be FR Ued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeFRUed()
	 * @generated
	 * @ordered
	 */
	protected Boolean canBeFRUed = CAN_BE_FR_UED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSKU() {
		return sku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSKU(String newSKU) {
		String oldSKU = sku;
		sku = newSKU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__SKU, oldSKU, sku));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartNumber(String newPartNumber) {
		String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__PART_NUMBER, oldPartNumber, partNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherIdentifyingInfo() {
		return otherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherIdentifyingInfo(String newOtherIdentifyingInfo) {
		String oldOtherIdentifyingInfo = otherIdentifyingInfo;
		otherIdentifyingInfo = newOtherIdentifyingInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__OTHER_IDENTIFYING_INFO, oldOtherIdentifyingInfo, otherIdentifyingInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPoweredOn() {
		return poweredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoweredOn(Boolean newPoweredOn) {
		Boolean oldPoweredOn = poweredOn;
		poweredOn = newPoweredOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__POWERED_ON, oldPoweredOn, poweredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufactureDate(String newManufactureDate) {
		String oldManufactureDate = manufactureDate;
		manufactureDate = newManufactureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURE_DATE, oldManufactureDate, manufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorEquipmentType() {
		return vendorEquipmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorEquipmentType(String newVendorEquipmentType) {
		String oldVendorEquipmentType = vendorEquipmentType;
		vendorEquipmentType = newVendorEquipmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE, oldVendorEquipmentType, vendorEquipmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserTracking() {
		return userTracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserTracking(String newUserTracking) {
		String oldUserTracking = userTracking;
		userTracking = newUserTracking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__USER_TRACKING, oldUserTracking, userTracking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanBeFRUed() {
		return canBeFRUed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanBeFRUed(Boolean newCanBeFRUed) {
		Boolean oldCanBeFRUed = canBeFRUed;
		canBeFRUed = newCanBeFRUed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ELEMENT__CAN_BE_FR_UED, oldCanBeFRUed, canBeFRUed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_ELEMENT__TAG:
				return getTag();
			case CimPackage.CIM_PHYSICAL_ELEMENT__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURER:
				return getManufacturer();
			case CimPackage.CIM_PHYSICAL_ELEMENT__MODEL:
				return getModel();
			case CimPackage.CIM_PHYSICAL_ELEMENT__SKU:
				return getSKU();
			case CimPackage.CIM_PHYSICAL_ELEMENT__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_PHYSICAL_ELEMENT__VERSION:
				return getVersion();
			case CimPackage.CIM_PHYSICAL_ELEMENT__PART_NUMBER:
				return getPartNumber();
			case CimPackage.CIM_PHYSICAL_ELEMENT__OTHER_IDENTIFYING_INFO:
				return getOtherIdentifyingInfo();
			case CimPackage.CIM_PHYSICAL_ELEMENT__POWERED_ON:
				return getPoweredOn();
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				return getManufactureDate();
			case CimPackage.CIM_PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				return getVendorEquipmentType();
			case CimPackage.CIM_PHYSICAL_ELEMENT__USER_TRACKING:
				return getUserTracking();
			case CimPackage.CIM_PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				return getCanBeFRUed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__MODEL:
				setModel((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__SKU:
				setSKU((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__OTHER_IDENTIFYING_INFO:
				setOtherIdentifyingInfo((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__POWERED_ON:
				setPoweredOn((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				setManufactureDate((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				setVendorEquipmentType((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__USER_TRACKING:
				setUserTracking((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				setCanBeFRUed((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_ELEMENT__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__SKU:
				setSKU(SKU_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__OTHER_IDENTIFYING_INFO:
				setOtherIdentifyingInfo(OTHER_IDENTIFYING_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__POWERED_ON:
				setPoweredOn(POWERED_ON_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				setManufactureDate(MANUFACTURE_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				setVendorEquipmentType(VENDOR_EQUIPMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__USER_TRACKING:
				setUserTracking(USER_TRACKING_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				setCanBeFRUed(CAN_BE_FR_UED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_ELEMENT__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case CimPackage.CIM_PHYSICAL_ELEMENT__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.CIM_PHYSICAL_ELEMENT__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case CimPackage.CIM_PHYSICAL_ELEMENT__SKU:
				return SKU_EDEFAULT == null ? sku != null : !SKU_EDEFAULT.equals(sku);
			case CimPackage.CIM_PHYSICAL_ELEMENT__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.CIM_PHYSICAL_ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_PHYSICAL_ELEMENT__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? partNumber != null : !PART_NUMBER_EDEFAULT.equals(partNumber);
			case CimPackage.CIM_PHYSICAL_ELEMENT__OTHER_IDENTIFYING_INFO:
				return OTHER_IDENTIFYING_INFO_EDEFAULT == null ? otherIdentifyingInfo != null : !OTHER_IDENTIFYING_INFO_EDEFAULT.equals(otherIdentifyingInfo);
			case CimPackage.CIM_PHYSICAL_ELEMENT__POWERED_ON:
				return POWERED_ON_EDEFAULT == null ? poweredOn != null : !POWERED_ON_EDEFAULT.equals(poweredOn);
			case CimPackage.CIM_PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				return MANUFACTURE_DATE_EDEFAULT == null ? manufactureDate != null : !MANUFACTURE_DATE_EDEFAULT.equals(manufactureDate);
			case CimPackage.CIM_PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				return VENDOR_EQUIPMENT_TYPE_EDEFAULT == null ? vendorEquipmentType != null : !VENDOR_EQUIPMENT_TYPE_EDEFAULT.equals(vendorEquipmentType);
			case CimPackage.CIM_PHYSICAL_ELEMENT__USER_TRACKING:
				return USER_TRACKING_EDEFAULT == null ? userTracking != null : !USER_TRACKING_EDEFAULT.equals(userTracking);
			case CimPackage.CIM_PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				return CAN_BE_FR_UED_EDEFAULT == null ? canBeFRUed != null : !CAN_BE_FR_UED_EDEFAULT.equals(canBeFRUed);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Tag: ");
		result.append(tag);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", Model: ");
		result.append(model);
		result.append(", SKU: ");
		result.append(sku);
		result.append(", SerialNumber: ");
		result.append(serialNumber);
		result.append(", Version: ");
		result.append(version);
		result.append(", PartNumber: ");
		result.append(partNumber);
		result.append(", OtherIdentifyingInfo: ");
		result.append(otherIdentifyingInfo);
		result.append(", PoweredOn: ");
		result.append(poweredOn);
		result.append(", ManufactureDate: ");
		result.append(manufactureDate);
		result.append(", VendorEquipmentType: ");
		result.append(vendorEquipmentType);
		result.append(", UserTracking: ");
		result.append(userTracking);
		result.append(", CanBeFRUed: ");
		result.append(canBeFRUed);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalElementImpl
