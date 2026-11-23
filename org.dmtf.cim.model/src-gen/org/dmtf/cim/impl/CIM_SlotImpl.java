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

import java.util.Collection;

import org.dmtf.cim.CIM_Slot;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getSupportsHotPlug <em>Supports Hot Plug</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getHeightAllowed <em>Height Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getLengthAllowed <em>Length Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getMaxDataWidth <em>Max Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getVccMixedVoltageSupport <em>Vcc Mixed Voltage Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getVppMixedVoltageSupport <em>Vpp Mixed Voltage Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getThermalRating <em>Thermal Rating</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getSpecialPurpose <em>Special Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getPurposeDescription <em>Purpose Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getPowered <em>Powered</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getOpenSwitch <em>Open Switch</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getMaxLinkWidth <em>Max Link Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getVendorCompatibilityStrings <em>Vendor Compatibility Strings</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SlotImpl#getBifurcationCapability <em>Bifurcation Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SlotImpl extends CIM_PhysicalConnectorImpl implements CIM_Slot {
	/**
	 * The default value of the '{@link #getSupportsHotPlug() <em>Supports Hot Plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsHotPlug()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_HOT_PLUG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsHotPlug() <em>Supports Hot Plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsHotPlug()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsHotPlug = SUPPORTS_HOT_PLUG_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightAllowed() <em>Height Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Float HEIGHT_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeightAllowed() <em>Height Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightAllowed()
	 * @generated
	 * @ordered
	 */
	protected Float heightAllowed = HEIGHT_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLengthAllowed() <em>Length Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Float LENGTH_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLengthAllowed() <em>Length Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthAllowed()
	 * @generated
	 * @ordered
	 */
	protected Float lengthAllowed = LENGTH_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDataWidth() <em>Max Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_DATA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDataWidth() <em>Max Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer maxDataWidth = MAX_DATA_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVccMixedVoltageSupport() <em>Vcc Mixed Voltage Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVccMixedVoltageSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> vccMixedVoltageSupport;

	/**
	 * The cached value of the '{@link #getVppMixedVoltageSupport() <em>Vpp Mixed Voltage Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVppMixedVoltageSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> vppMixedVoltageSupport;

	/**
	 * The default value of the '{@link #getThermalRating() <em>Thermal Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalRating()
	 * @generated
	 * @ordered
	 */
	protected static final Long THERMAL_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalRating() <em>Thermal Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalRating()
	 * @generated
	 * @ordered
	 */
	protected Long thermalRating = THERMAL_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialPurpose() <em>Special Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPECIAL_PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialPurpose() <em>Special Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPurpose()
	 * @generated
	 * @ordered
	 */
	protected Boolean specialPurpose = SPECIAL_PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected String purposeDescription = PURPOSE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowered() <em>Powered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean POWERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowered() <em>Powered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowered()
	 * @generated
	 * @ordered
	 */
	protected Boolean powered = POWERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenSwitch() <em>Open Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPEN_SWITCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenSwitch() <em>Open Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenSwitch()
	 * @generated
	 * @ordered
	 */
	protected Boolean openSwitch = OPEN_SWITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLinkWidth() <em>Max Link Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLinkWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LINK_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLinkWidth() <em>Max Link Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLinkWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLinkWidth = MAX_LINK_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendorCompatibilityStrings() <em>Vendor Compatibility Strings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorCompatibilityStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vendorCompatibilityStrings;

	/**
	 * The default value of the '{@link #getBifurcationCapability() <em>Bifurcation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBifurcationCapability()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BIFURCATION_CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBifurcationCapability() <em>Bifurcation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBifurcationCapability()
	 * @generated
	 * @ordered
	 */
	protected Boolean bifurcationCapability = BIFURCATION_CAPABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Slot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsHotPlug() {
		return supportsHotPlug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsHotPlug(Boolean newSupportsHotPlug) {
		Boolean oldSupportsHotPlug = supportsHotPlug;
		supportsHotPlug = newSupportsHotPlug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__SUPPORTS_HOT_PLUG, oldSupportsHotPlug, supportsHotPlug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getHeightAllowed() {
		return heightAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeightAllowed(Float newHeightAllowed) {
		Float oldHeightAllowed = heightAllowed;
		heightAllowed = newHeightAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__HEIGHT_ALLOWED, oldHeightAllowed, heightAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getLengthAllowed() {
		return lengthAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLengthAllowed(Float newLengthAllowed) {
		Float oldLengthAllowed = lengthAllowed;
		lengthAllowed = newLengthAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__LENGTH_ALLOWED, oldLengthAllowed, lengthAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxDataWidth() {
		return maxDataWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataWidth(Integer newMaxDataWidth) {
		Integer oldMaxDataWidth = maxDataWidth;
		maxDataWidth = newMaxDataWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__MAX_DATA_WIDTH, oldMaxDataWidth, maxDataWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getVccMixedVoltageSupport() {
		if (vccMixedVoltageSupport == null) {
			vccMixedVoltageSupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SLOT__VCC_MIXED_VOLTAGE_SUPPORT);
		}
		return vccMixedVoltageSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getVppMixedVoltageSupport() {
		if (vppMixedVoltageSupport == null) {
			vppMixedVoltageSupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SLOT__VPP_MIXED_VOLTAGE_SUPPORT);
		}
		return vppMixedVoltageSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getThermalRating() {
		return thermalRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThermalRating(Long newThermalRating) {
		Long oldThermalRating = thermalRating;
		thermalRating = newThermalRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__THERMAL_RATING, oldThermalRating, thermalRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSpecialPurpose() {
		return specialPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialPurpose(Boolean newSpecialPurpose) {
		Boolean oldSpecialPurpose = specialPurpose;
		specialPurpose = newSpecialPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__SPECIAL_PURPOSE, oldSpecialPurpose, specialPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurposeDescription() {
		return purposeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurposeDescription(String newPurposeDescription) {
		String oldPurposeDescription = purposeDescription;
		purposeDescription = newPurposeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__PURPOSE_DESCRIPTION, oldPurposeDescription, purposeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(Integer newNumber) {
		Integer oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPowered() {
		return powered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowered(Boolean newPowered) {
		Boolean oldPowered = powered;
		powered = newPowered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__POWERED, oldPowered, powered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOpenSwitch() {
		return openSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenSwitch(Boolean newOpenSwitch) {
		Boolean oldOpenSwitch = openSwitch;
		openSwitch = newOpenSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__OPEN_SWITCH, oldOpenSwitch, openSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLinkWidth() {
		return maxLinkWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLinkWidth(Integer newMaxLinkWidth) {
		Integer oldMaxLinkWidth = maxLinkWidth;
		maxLinkWidth = newMaxLinkWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__MAX_LINK_WIDTH, oldMaxLinkWidth, maxLinkWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVendorCompatibilityStrings() {
		if (vendorCompatibilityStrings == null) {
			vendorCompatibilityStrings = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SLOT__VENDOR_COMPATIBILITY_STRINGS);
		}
		return vendorCompatibilityStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBifurcationCapability() {
		return bifurcationCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBifurcationCapability(Boolean newBifurcationCapability) {
		Boolean oldBifurcationCapability = bifurcationCapability;
		bifurcationCapability = newBifurcationCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SLOT__BIFURCATION_CAPABILITY, oldBifurcationCapability, bifurcationCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SLOT__SUPPORTS_HOT_PLUG:
				return getSupportsHotPlug();
			case CimPackage.CIM_SLOT__HEIGHT_ALLOWED:
				return getHeightAllowed();
			case CimPackage.CIM_SLOT__LENGTH_ALLOWED:
				return getLengthAllowed();
			case CimPackage.CIM_SLOT__MAX_DATA_WIDTH:
				return getMaxDataWidth();
			case CimPackage.CIM_SLOT__VCC_MIXED_VOLTAGE_SUPPORT:
				return getVccMixedVoltageSupport();
			case CimPackage.CIM_SLOT__VPP_MIXED_VOLTAGE_SUPPORT:
				return getVppMixedVoltageSupport();
			case CimPackage.CIM_SLOT__THERMAL_RATING:
				return getThermalRating();
			case CimPackage.CIM_SLOT__SPECIAL_PURPOSE:
				return getSpecialPurpose();
			case CimPackage.CIM_SLOT__PURPOSE_DESCRIPTION:
				return getPurposeDescription();
			case CimPackage.CIM_SLOT__NUMBER:
				return getNumber();
			case CimPackage.CIM_SLOT__POWERED:
				return getPowered();
			case CimPackage.CIM_SLOT__OPEN_SWITCH:
				return getOpenSwitch();
			case CimPackage.CIM_SLOT__MAX_LINK_WIDTH:
				return getMaxLinkWidth();
			case CimPackage.CIM_SLOT__VENDOR_COMPATIBILITY_STRINGS:
				return getVendorCompatibilityStrings();
			case CimPackage.CIM_SLOT__BIFURCATION_CAPABILITY:
				return getBifurcationCapability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_SLOT__SUPPORTS_HOT_PLUG:
				setSupportsHotPlug((Boolean)newValue);
				return;
			case CimPackage.CIM_SLOT__HEIGHT_ALLOWED:
				setHeightAllowed((Float)newValue);
				return;
			case CimPackage.CIM_SLOT__LENGTH_ALLOWED:
				setLengthAllowed((Float)newValue);
				return;
			case CimPackage.CIM_SLOT__MAX_DATA_WIDTH:
				setMaxDataWidth((Integer)newValue);
				return;
			case CimPackage.CIM_SLOT__VCC_MIXED_VOLTAGE_SUPPORT:
				getVccMixedVoltageSupport().clear();
				getVccMixedVoltageSupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SLOT__VPP_MIXED_VOLTAGE_SUPPORT:
				getVppMixedVoltageSupport().clear();
				getVppMixedVoltageSupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SLOT__THERMAL_RATING:
				setThermalRating((Long)newValue);
				return;
			case CimPackage.CIM_SLOT__SPECIAL_PURPOSE:
				setSpecialPurpose((Boolean)newValue);
				return;
			case CimPackage.CIM_SLOT__PURPOSE_DESCRIPTION:
				setPurposeDescription((String)newValue);
				return;
			case CimPackage.CIM_SLOT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CimPackage.CIM_SLOT__POWERED:
				setPowered((Boolean)newValue);
				return;
			case CimPackage.CIM_SLOT__OPEN_SWITCH:
				setOpenSwitch((Boolean)newValue);
				return;
			case CimPackage.CIM_SLOT__MAX_LINK_WIDTH:
				setMaxLinkWidth((Integer)newValue);
				return;
			case CimPackage.CIM_SLOT__VENDOR_COMPATIBILITY_STRINGS:
				getVendorCompatibilityStrings().clear();
				getVendorCompatibilityStrings().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SLOT__BIFURCATION_CAPABILITY:
				setBifurcationCapability((Boolean)newValue);
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
			case CimPackage.CIM_SLOT__SUPPORTS_HOT_PLUG:
				setSupportsHotPlug(SUPPORTS_HOT_PLUG_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__HEIGHT_ALLOWED:
				setHeightAllowed(HEIGHT_ALLOWED_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__LENGTH_ALLOWED:
				setLengthAllowed(LENGTH_ALLOWED_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__MAX_DATA_WIDTH:
				setMaxDataWidth(MAX_DATA_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__VCC_MIXED_VOLTAGE_SUPPORT:
				getVccMixedVoltageSupport().clear();
				return;
			case CimPackage.CIM_SLOT__VPP_MIXED_VOLTAGE_SUPPORT:
				getVppMixedVoltageSupport().clear();
				return;
			case CimPackage.CIM_SLOT__THERMAL_RATING:
				setThermalRating(THERMAL_RATING_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__SPECIAL_PURPOSE:
				setSpecialPurpose(SPECIAL_PURPOSE_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__PURPOSE_DESCRIPTION:
				setPurposeDescription(PURPOSE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__POWERED:
				setPowered(POWERED_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__OPEN_SWITCH:
				setOpenSwitch(OPEN_SWITCH_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__MAX_LINK_WIDTH:
				setMaxLinkWidth(MAX_LINK_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_SLOT__VENDOR_COMPATIBILITY_STRINGS:
				getVendorCompatibilityStrings().clear();
				return;
			case CimPackage.CIM_SLOT__BIFURCATION_CAPABILITY:
				setBifurcationCapability(BIFURCATION_CAPABILITY_EDEFAULT);
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
			case CimPackage.CIM_SLOT__SUPPORTS_HOT_PLUG:
				return SUPPORTS_HOT_PLUG_EDEFAULT == null ? supportsHotPlug != null : !SUPPORTS_HOT_PLUG_EDEFAULT.equals(supportsHotPlug);
			case CimPackage.CIM_SLOT__HEIGHT_ALLOWED:
				return HEIGHT_ALLOWED_EDEFAULT == null ? heightAllowed != null : !HEIGHT_ALLOWED_EDEFAULT.equals(heightAllowed);
			case CimPackage.CIM_SLOT__LENGTH_ALLOWED:
				return LENGTH_ALLOWED_EDEFAULT == null ? lengthAllowed != null : !LENGTH_ALLOWED_EDEFAULT.equals(lengthAllowed);
			case CimPackage.CIM_SLOT__MAX_DATA_WIDTH:
				return MAX_DATA_WIDTH_EDEFAULT == null ? maxDataWidth != null : !MAX_DATA_WIDTH_EDEFAULT.equals(maxDataWidth);
			case CimPackage.CIM_SLOT__VCC_MIXED_VOLTAGE_SUPPORT:
				return vccMixedVoltageSupport != null && !vccMixedVoltageSupport.isEmpty();
			case CimPackage.CIM_SLOT__VPP_MIXED_VOLTAGE_SUPPORT:
				return vppMixedVoltageSupport != null && !vppMixedVoltageSupport.isEmpty();
			case CimPackage.CIM_SLOT__THERMAL_RATING:
				return THERMAL_RATING_EDEFAULT == null ? thermalRating != null : !THERMAL_RATING_EDEFAULT.equals(thermalRating);
			case CimPackage.CIM_SLOT__SPECIAL_PURPOSE:
				return SPECIAL_PURPOSE_EDEFAULT == null ? specialPurpose != null : !SPECIAL_PURPOSE_EDEFAULT.equals(specialPurpose);
			case CimPackage.CIM_SLOT__PURPOSE_DESCRIPTION:
				return PURPOSE_DESCRIPTION_EDEFAULT == null ? purposeDescription != null : !PURPOSE_DESCRIPTION_EDEFAULT.equals(purposeDescription);
			case CimPackage.CIM_SLOT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CimPackage.CIM_SLOT__POWERED:
				return POWERED_EDEFAULT == null ? powered != null : !POWERED_EDEFAULT.equals(powered);
			case CimPackage.CIM_SLOT__OPEN_SWITCH:
				return OPEN_SWITCH_EDEFAULT == null ? openSwitch != null : !OPEN_SWITCH_EDEFAULT.equals(openSwitch);
			case CimPackage.CIM_SLOT__MAX_LINK_WIDTH:
				return MAX_LINK_WIDTH_EDEFAULT == null ? maxLinkWidth != null : !MAX_LINK_WIDTH_EDEFAULT.equals(maxLinkWidth);
			case CimPackage.CIM_SLOT__VENDOR_COMPATIBILITY_STRINGS:
				return vendorCompatibilityStrings != null && !vendorCompatibilityStrings.isEmpty();
			case CimPackage.CIM_SLOT__BIFURCATION_CAPABILITY:
				return BIFURCATION_CAPABILITY_EDEFAULT == null ? bifurcationCapability != null : !BIFURCATION_CAPABILITY_EDEFAULT.equals(bifurcationCapability);
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
		result.append(" (SupportsHotPlug: ");
		result.append(supportsHotPlug);
		result.append(", HeightAllowed: ");
		result.append(heightAllowed);
		result.append(", LengthAllowed: ");
		result.append(lengthAllowed);
		result.append(", MaxDataWidth: ");
		result.append(maxDataWidth);
		result.append(", VccMixedVoltageSupport: ");
		result.append(vccMixedVoltageSupport);
		result.append(", VppMixedVoltageSupport: ");
		result.append(vppMixedVoltageSupport);
		result.append(", ThermalRating: ");
		result.append(thermalRating);
		result.append(", SpecialPurpose: ");
		result.append(specialPurpose);
		result.append(", PurposeDescription: ");
		result.append(purposeDescription);
		result.append(", Number: ");
		result.append(number);
		result.append(", Powered: ");
		result.append(powered);
		result.append(", OpenSwitch: ");
		result.append(openSwitch);
		result.append(", MaxLinkWidth: ");
		result.append(maxLinkWidth);
		result.append(", VendorCompatibilityStrings: ");
		result.append(vendorCompatibilityStrings);
		result.append(", BifurcationCapability: ");
		result.append(bifurcationCapability);
		result.append(')');
		return result.toString();
	}

} //CIM_SlotImpl
