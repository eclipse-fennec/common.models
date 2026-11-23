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

import org.dmtf.cim.CIM_SoftwareElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getOtherTargetOS <em>Other Target OS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getIdentificationCode <em>Identification Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementImpl#getLanguageEdition <em>Language Edition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SoftwareElementImpl extends CIM_LogicalElementImpl implements CIM_SoftwareElement {
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
	 * The default value of the '{@link #getSoftwareElementState() <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOFTWARE_ELEMENT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementState() <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementState()
	 * @generated
	 * @ordered
	 */
	protected Integer softwareElementState = SOFTWARE_ELEMENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareElementID() <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementID() <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementID()
	 * @generated
	 * @ordered
	 */
	protected String softwareElementID = SOFTWARE_ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperatingSystem() <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_OPERATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOperatingSystem() <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected Integer targetOperatingSystem = TARGET_OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTargetOS() <em>Other Target OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetOS()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TARGET_OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTargetOS() <em>Other Target OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetOS()
	 * @generated
	 * @ordered
	 */
	protected String otherTargetOS = OTHER_TARGET_OS_EDEFAULT;

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
	 * The default value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected String buildNumber = BUILD_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getCodeSet() <em>Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSet() <em>Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSet()
	 * @generated
	 * @ordered
	 */
	protected String codeSet = CODE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentificationCode() <em>Identification Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificationCode() <em>Identification Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationCode()
	 * @generated
	 * @ordered
	 */
	protected String identificationCode = IDENTIFICATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageEdition() <em>Language Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageEdition() <em>Language Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageEdition()
	 * @generated
	 * @ordered
	 */
	protected String languageEdition = LANGUAGE_EDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareElement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSoftwareElementState() {
		return softwareElementState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareElementState(Integer newSoftwareElementState) {
		Integer oldSoftwareElementState = softwareElementState;
		softwareElementState = newSoftwareElementState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE, oldSoftwareElementState, softwareElementState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftwareElementID() {
		return softwareElementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareElementID(String newSoftwareElementID) {
		String oldSoftwareElementID = softwareElementID;
		softwareElementID = newSoftwareElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID, oldSoftwareElementID, softwareElementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetOperatingSystem() {
		return targetOperatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetOperatingSystem(Integer newTargetOperatingSystem) {
		Integer oldTargetOperatingSystem = targetOperatingSystem;
		targetOperatingSystem = newTargetOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM, oldTargetOperatingSystem, targetOperatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTargetOS() {
		return otherTargetOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTargetOS(String newOtherTargetOS) {
		String oldOtherTargetOS = otherTargetOS;
		otherTargetOS = newOtherTargetOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__OTHER_TARGET_OS, oldOtherTargetOS, otherTargetOS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildNumber() {
		return buildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildNumber(String newBuildNumber) {
		String oldBuildNumber = buildNumber;
		buildNumber = newBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__BUILD_NUMBER, oldBuildNumber, buildNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeSet() {
		return codeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeSet(String newCodeSet) {
		String oldCodeSet = codeSet;
		codeSet = newCodeSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__CODE_SET, oldCodeSet, codeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentificationCode() {
		return identificationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentificationCode(String newIdentificationCode) {
		String oldIdentificationCode = identificationCode;
		identificationCode = newIdentificationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__IDENTIFICATION_CODE, oldIdentificationCode, identificationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguageEdition() {
		return languageEdition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguageEdition(String newLanguageEdition) {
		String oldLanguageEdition = languageEdition;
		languageEdition = newLanguageEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT__LANGUAGE_EDITION, oldLanguageEdition, languageEdition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOFTWARE_ELEMENT__VERSION:
				return getVersion();
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				return getSoftwareElementState();
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				return getSoftwareElementID();
			case CimPackage.CIM_SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				return getTargetOperatingSystem();
			case CimPackage.CIM_SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				return getOtherTargetOS();
			case CimPackage.CIM_SOFTWARE_ELEMENT__MANUFACTURER:
				return getManufacturer();
			case CimPackage.CIM_SOFTWARE_ELEMENT__BUILD_NUMBER:
				return getBuildNumber();
			case CimPackage.CIM_SOFTWARE_ELEMENT__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_SOFTWARE_ELEMENT__CODE_SET:
				return getCodeSet();
			case CimPackage.CIM_SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				return getIdentificationCode();
			case CimPackage.CIM_SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				return getLanguageEdition();
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
			case CimPackage.CIM_SOFTWARE_ELEMENT__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				setOtherTargetOS((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__BUILD_NUMBER:
				setBuildNumber((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__CODE_SET:
				setCodeSet((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				setIdentificationCode((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				setLanguageEdition((String)newValue);
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
			case CimPackage.CIM_SOFTWARE_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState(SOFTWARE_ELEMENT_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID(SOFTWARE_ELEMENT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem(TARGET_OPERATING_SYSTEM_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				setOtherTargetOS(OTHER_TARGET_OS_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__BUILD_NUMBER:
				setBuildNumber(BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__CODE_SET:
				setCodeSet(CODE_SET_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				setIdentificationCode(IDENTIFICATION_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				setLanguageEdition(LANGUAGE_EDITION_EDEFAULT);
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
			case CimPackage.CIM_SOFTWARE_ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				return SOFTWARE_ELEMENT_STATE_EDEFAULT == null ? softwareElementState != null : !SOFTWARE_ELEMENT_STATE_EDEFAULT.equals(softwareElementState);
			case CimPackage.CIM_SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				return SOFTWARE_ELEMENT_ID_EDEFAULT == null ? softwareElementID != null : !SOFTWARE_ELEMENT_ID_EDEFAULT.equals(softwareElementID);
			case CimPackage.CIM_SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				return TARGET_OPERATING_SYSTEM_EDEFAULT == null ? targetOperatingSystem != null : !TARGET_OPERATING_SYSTEM_EDEFAULT.equals(targetOperatingSystem);
			case CimPackage.CIM_SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				return OTHER_TARGET_OS_EDEFAULT == null ? otherTargetOS != null : !OTHER_TARGET_OS_EDEFAULT.equals(otherTargetOS);
			case CimPackage.CIM_SOFTWARE_ELEMENT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.CIM_SOFTWARE_ELEMENT__BUILD_NUMBER:
				return BUILD_NUMBER_EDEFAULT == null ? buildNumber != null : !BUILD_NUMBER_EDEFAULT.equals(buildNumber);
			case CimPackage.CIM_SOFTWARE_ELEMENT__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.CIM_SOFTWARE_ELEMENT__CODE_SET:
				return CODE_SET_EDEFAULT == null ? codeSet != null : !CODE_SET_EDEFAULT.equals(codeSet);
			case CimPackage.CIM_SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				return IDENTIFICATION_CODE_EDEFAULT == null ? identificationCode != null : !IDENTIFICATION_CODE_EDEFAULT.equals(identificationCode);
			case CimPackage.CIM_SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				return LANGUAGE_EDITION_EDEFAULT == null ? languageEdition != null : !LANGUAGE_EDITION_EDEFAULT.equals(languageEdition);
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
		result.append(" (Version: ");
		result.append(version);
		result.append(", SoftwareElementState: ");
		result.append(softwareElementState);
		result.append(", SoftwareElementID: ");
		result.append(softwareElementID);
		result.append(", TargetOperatingSystem: ");
		result.append(targetOperatingSystem);
		result.append(", OtherTargetOS: ");
		result.append(otherTargetOS);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", BuildNumber: ");
		result.append(buildNumber);
		result.append(", SerialNumber: ");
		result.append(serialNumber);
		result.append(", CodeSet: ");
		result.append(codeSet);
		result.append(", IdentificationCode: ");
		result.append(identificationCode);
		result.append(", LanguageEdition: ");
		result.append(languageEdition);
		result.append(')');
		return result.toString();
	}

} //CIM_SoftwareElementImpl
