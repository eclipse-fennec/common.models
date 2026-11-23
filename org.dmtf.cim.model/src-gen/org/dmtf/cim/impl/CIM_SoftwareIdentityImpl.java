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

import org.dmtf.cim.CIM_SoftwareIdentity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getLargeBuildNumber <em>Large Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getIsLargeBuildNumber <em>Is Large Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getVersionString <em>Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getTargetOperatingSystems <em>Target Operating Systems</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getClassificationDescriptions <em>Classification Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getTargetTypes <em>Target Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getIdentityInfoValue <em>Identity Info Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getIdentityInfoType <em>Identity Info Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getIsEntity <em>Is Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getExtendedResourceType <em>Extended Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getOtherExtendedResourceTypeDescription <em>Other Extended Resource Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getMinExtendedResourceTypeMajorVersion <em>Min Extended Resource Type Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getMinExtendedResourceTypeMinorVersion <em>Min Extended Resource Type Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getMinExtendedResourceTypeRevisionNumber <em>Min Extended Resource Type Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getMinExtendedResourceTypeBuildNumber <em>Min Extended Resource Type Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareIdentityImpl#getTargetOSTypes <em>Target OS Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SoftwareIdentityImpl extends CIM_LogicalElementImpl implements CIM_SoftwareIdentity {
	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer majorVersion = MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer minorVersion = MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer buildNumber = BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeBuildNumber() <em>Large Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long LARGE_BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargeBuildNumber() <em>Large Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Long largeBuildNumber = LARGE_BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLargeBuildNumber() <em>Is Large Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLargeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LARGE_BUILD_NUMBER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsLargeBuildNumber() <em>Is Large Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLargeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLargeBuildNumber = IS_LARGE_BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionString()
	 * @generated
	 * @ordered
	 */
	protected String versionString = VERSION_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetOperatingSystems() <em>Target Operating Systems</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetOperatingSystems;

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
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> languages;

	/**
	 * The cached value of the '{@link #getClassifications() <em>Classifications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> classifications;

	/**
	 * The cached value of the '{@link #getClassificationDescriptions() <em>Classification Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classificationDescriptions;

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
	 * The cached value of the '{@link #getTargetTypes() <em>Target Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetTypes;

	/**
	 * The cached value of the '{@link #getIdentityInfoValue() <em>Identity Info Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityInfoValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identityInfoValue;

	/**
	 * The cached value of the '{@link #getIdentityInfoType() <em>Identity Info Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityInfoType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identityInfoType;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected String releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEntity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ENTITY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEntity()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEntity = IS_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendedResourceType() <em>Extended Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTENDED_RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedResourceType() <em>Extended Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedResourceType()
	 * @generated
	 * @ordered
	 */
	protected Integer extendedResourceType = EXTENDED_RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherExtendedResourceTypeDescription() <em>Other Extended Resource Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherExtendedResourceTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherExtendedResourceTypeDescription() <em>Other Extended Resource Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherExtendedResourceTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherExtendedResourceTypeDescription = OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeMajorVersion() <em>Min Extended Resource Type Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeMajorVersion() <em>Min Extended Resource Type Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer minExtendedResourceTypeMajorVersion = MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeMinorVersion() <em>Min Extended Resource Type Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeMinorVersion() <em>Min Extended Resource Type Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer minExtendedResourceTypeMinorVersion = MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeRevisionNumber() <em>Min Extended Resource Type Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeRevisionNumber() <em>Min Extended Resource Type Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer minExtendedResourceTypeRevisionNumber = MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeBuildNumber() <em>Min Extended Resource Type Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeBuildNumber() <em>Min Extended Resource Type Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer minExtendedResourceTypeBuildNumber = MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetOSTypes() <em>Target OS Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOSTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> targetOSTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMajorVersion() {
		return majorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMajorVersion(Integer newMajorVersion) {
		Integer oldMajorVersion = majorVersion;
		majorVersion = newMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MAJOR_VERSION, oldMajorVersion, majorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinorVersion() {
		return minorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinorVersion(Integer newMinorVersion) {
		Integer oldMinorVersion = minorVersion;
		minorVersion = newMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MINOR_VERSION, oldMinorVersion, minorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionNumber(Integer newRevisionNumber) {
		Integer oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBuildNumber() {
		return buildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildNumber(Integer newBuildNumber) {
		Integer oldBuildNumber = buildNumber;
		buildNumber = newBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__BUILD_NUMBER, oldBuildNumber, buildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLargeBuildNumber() {
		return largeBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLargeBuildNumber(Long newLargeBuildNumber) {
		Long oldLargeBuildNumber = largeBuildNumber;
		largeBuildNumber = newLargeBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__LARGE_BUILD_NUMBER, oldLargeBuildNumber, largeBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsLargeBuildNumber() {
		return isLargeBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLargeBuildNumber(Boolean newIsLargeBuildNumber) {
		Boolean oldIsLargeBuildNumber = isLargeBuildNumber;
		isLargeBuildNumber = newIsLargeBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__IS_LARGE_BUILD_NUMBER, oldIsLargeBuildNumber, isLargeBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionString() {
		return versionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionString(String newVersionString) {
		String oldVersionString = versionString;
		versionString = newVersionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__VERSION_STRING, oldVersionString, versionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTargetOperatingSystems() {
		if (targetOperatingSystems == null) {
			targetOperatingSystems = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS);
		}
		return targetOperatingSystems;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClassifications() {
		if (classifications == null) {
			classifications = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATIONS);
		}
		return classifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getClassificationDescriptions() {
		if (classificationDescriptions == null) {
			classificationDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS);
		}
		return classificationDescriptions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTargetTypes() {
		if (targetTypes == null) {
			targetTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_TYPES);
		}
		return targetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentityInfoValue() {
		if (identityInfoValue == null) {
			identityInfoValue = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE);
		}
		return identityInfoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentityInfoType() {
		if (identityInfoType == null) {
			identityInfoType = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE);
		}
		return identityInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(String newReleaseDate) {
		String oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsEntity() {
		return isEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEntity(Boolean newIsEntity) {
		Boolean oldIsEntity = isEntity;
		isEntity = newIsEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__IS_ENTITY, oldIsEntity, isEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExtendedResourceType() {
		return extendedResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedResourceType(Integer newExtendedResourceType) {
		Integer oldExtendedResourceType = extendedResourceType;
		extendedResourceType = newExtendedResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE, oldExtendedResourceType, extendedResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherExtendedResourceTypeDescription() {
		return otherExtendedResourceTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherExtendedResourceTypeDescription(String newOtherExtendedResourceTypeDescription) {
		String oldOtherExtendedResourceTypeDescription = otherExtendedResourceTypeDescription;
		otherExtendedResourceTypeDescription = newOtherExtendedResourceTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION, oldOtherExtendedResourceTypeDescription, otherExtendedResourceTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinExtendedResourceTypeMajorVersion() {
		return minExtendedResourceTypeMajorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinExtendedResourceTypeMajorVersion(Integer newMinExtendedResourceTypeMajorVersion) {
		Integer oldMinExtendedResourceTypeMajorVersion = minExtendedResourceTypeMajorVersion;
		minExtendedResourceTypeMajorVersion = newMinExtendedResourceTypeMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION, oldMinExtendedResourceTypeMajorVersion, minExtendedResourceTypeMajorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinExtendedResourceTypeMinorVersion() {
		return minExtendedResourceTypeMinorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinExtendedResourceTypeMinorVersion(Integer newMinExtendedResourceTypeMinorVersion) {
		Integer oldMinExtendedResourceTypeMinorVersion = minExtendedResourceTypeMinorVersion;
		minExtendedResourceTypeMinorVersion = newMinExtendedResourceTypeMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION, oldMinExtendedResourceTypeMinorVersion, minExtendedResourceTypeMinorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinExtendedResourceTypeRevisionNumber() {
		return minExtendedResourceTypeRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinExtendedResourceTypeRevisionNumber(Integer newMinExtendedResourceTypeRevisionNumber) {
		Integer oldMinExtendedResourceTypeRevisionNumber = minExtendedResourceTypeRevisionNumber;
		minExtendedResourceTypeRevisionNumber = newMinExtendedResourceTypeRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER, oldMinExtendedResourceTypeRevisionNumber, minExtendedResourceTypeRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinExtendedResourceTypeBuildNumber() {
		return minExtendedResourceTypeBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinExtendedResourceTypeBuildNumber(Integer newMinExtendedResourceTypeBuildNumber) {
		Integer oldMinExtendedResourceTypeBuildNumber = minExtendedResourceTypeBuildNumber;
		minExtendedResourceTypeBuildNumber = newMinExtendedResourceTypeBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER, oldMinExtendedResourceTypeBuildNumber, minExtendedResourceTypeBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getTargetOSTypes() {
		if (targetOSTypes == null) {
			targetOSTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OS_TYPES);
		}
		return targetOSTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOFTWARE_IDENTITY__MAJOR_VERSION:
				return getMajorVersion();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MINOR_VERSION:
				return getMinorVersion();
			case CimPackage.CIM_SOFTWARE_IDENTITY__REVISION_NUMBER:
				return getRevisionNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__BUILD_NUMBER:
				return getBuildNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__LARGE_BUILD_NUMBER:
				return getLargeBuildNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_LARGE_BUILD_NUMBER:
				return getIsLargeBuildNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__VERSION_STRING:
				return getVersionString();
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				return getTargetOperatingSystems();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MANUFACTURER:
				return getManufacturer();
			case CimPackage.CIM_SOFTWARE_IDENTITY__LANGUAGES:
				return getLanguages();
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATIONS:
				return getClassifications();
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				return getClassificationDescriptions();
			case CimPackage.CIM_SOFTWARE_IDENTITY__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_TYPES:
				return getTargetTypes();
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				return getIdentityInfoValue();
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				return getIdentityInfoType();
			case CimPackage.CIM_SOFTWARE_IDENTITY__RELEASE_DATE:
				return getReleaseDate();
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_ENTITY:
				return getIsEntity();
			case CimPackage.CIM_SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				return getExtendedResourceType();
			case CimPackage.CIM_SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				return getOtherExtendedResourceTypeDescription();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				return getMinExtendedResourceTypeMajorVersion();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				return getMinExtendedResourceTypeMinorVersion();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				return getMinExtendedResourceTypeRevisionNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				return getMinExtendedResourceTypeBuildNumber();
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				return getTargetOSTypes();
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
			case CimPackage.CIM_SOFTWARE_IDENTITY__MAJOR_VERSION:
				setMajorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MINOR_VERSION:
				setMinorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__BUILD_NUMBER:
				setBuildNumber((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__LARGE_BUILD_NUMBER:
				setLargeBuildNumber((Long)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_LARGE_BUILD_NUMBER:
				setIsLargeBuildNumber((Boolean)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__VERSION_STRING:
				setVersionString((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				getTargetOperatingSystems().clear();
				getTargetOperatingSystems().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATIONS:
				getClassifications().clear();
				getClassifications().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				getClassificationDescriptions().clear();
				getClassificationDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_TYPES:
				getTargetTypes().clear();
				getTargetTypes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				getIdentityInfoValue().clear();
				getIdentityInfoValue().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				getIdentityInfoType().clear();
				getIdentityInfoType().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__RELEASE_DATE:
				setReleaseDate((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_ENTITY:
				setIsEntity((Boolean)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				setExtendedResourceType((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				setOtherExtendedResourceTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				setMinExtendedResourceTypeMajorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				setMinExtendedResourceTypeMinorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				setMinExtendedResourceTypeRevisionNumber((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				setMinExtendedResourceTypeBuildNumber((Integer)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				getTargetOSTypes().clear();
				getTargetOSTypes().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_SOFTWARE_IDENTITY__MAJOR_VERSION:
				setMajorVersion(MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MINOR_VERSION:
				setMinorVersion(MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__BUILD_NUMBER:
				setBuildNumber(BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__LARGE_BUILD_NUMBER:
				setLargeBuildNumber(LARGE_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_LARGE_BUILD_NUMBER:
				setIsLargeBuildNumber(IS_LARGE_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__VERSION_STRING:
				setVersionString(VERSION_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				getTargetOperatingSystems().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__LANGUAGES:
				getLanguages().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATIONS:
				getClassifications().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				getClassificationDescriptions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_TYPES:
				getTargetTypes().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				getIdentityInfoValue().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				getIdentityInfoType().clear();
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_ENTITY:
				setIsEntity(IS_ENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				setExtendedResourceType(EXTENDED_RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				setOtherExtendedResourceTypeDescription(OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				setMinExtendedResourceTypeMajorVersion(MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				setMinExtendedResourceTypeMinorVersion(MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				setMinExtendedResourceTypeRevisionNumber(MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				setMinExtendedResourceTypeBuildNumber(MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				getTargetOSTypes().clear();
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
			case CimPackage.CIM_SOFTWARE_IDENTITY__MAJOR_VERSION:
				return MAJOR_VERSION_EDEFAULT == null ? majorVersion != null : !MAJOR_VERSION_EDEFAULT.equals(majorVersion);
			case CimPackage.CIM_SOFTWARE_IDENTITY__MINOR_VERSION:
				return MINOR_VERSION_EDEFAULT == null ? minorVersion != null : !MINOR_VERSION_EDEFAULT.equals(minorVersion);
			case CimPackage.CIM_SOFTWARE_IDENTITY__REVISION_NUMBER:
				return REVISION_NUMBER_EDEFAULT == null ? revisionNumber != null : !REVISION_NUMBER_EDEFAULT.equals(revisionNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__BUILD_NUMBER:
				return BUILD_NUMBER_EDEFAULT == null ? buildNumber != null : !BUILD_NUMBER_EDEFAULT.equals(buildNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__LARGE_BUILD_NUMBER:
				return LARGE_BUILD_NUMBER_EDEFAULT == null ? largeBuildNumber != null : !LARGE_BUILD_NUMBER_EDEFAULT.equals(largeBuildNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_LARGE_BUILD_NUMBER:
				return IS_LARGE_BUILD_NUMBER_EDEFAULT == null ? isLargeBuildNumber != null : !IS_LARGE_BUILD_NUMBER_EDEFAULT.equals(isLargeBuildNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__VERSION_STRING:
				return VERSION_STRING_EDEFAULT == null ? versionString != null : !VERSION_STRING_EDEFAULT.equals(versionString);
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				return targetOperatingSystems != null && !targetOperatingSystems.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.CIM_SOFTWARE_IDENTITY__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATIONS:
				return classifications != null && !classifications.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				return classificationDescriptions != null && !classificationDescriptions.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_TYPES:
				return targetTypes != null && !targetTypes.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				return identityInfoValue != null && !identityInfoValue.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				return identityInfoType != null && !identityInfoType.isEmpty();
			case CimPackage.CIM_SOFTWARE_IDENTITY__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case CimPackage.CIM_SOFTWARE_IDENTITY__IS_ENTITY:
				return IS_ENTITY_EDEFAULT == null ? isEntity != null : !IS_ENTITY_EDEFAULT.equals(isEntity);
			case CimPackage.CIM_SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				return EXTENDED_RESOURCE_TYPE_EDEFAULT == null ? extendedResourceType != null : !EXTENDED_RESOURCE_TYPE_EDEFAULT.equals(extendedResourceType);
			case CimPackage.CIM_SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				return OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT == null ? otherExtendedResourceTypeDescription != null : !OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT.equals(otherExtendedResourceTypeDescription);
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				return MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT == null ? minExtendedResourceTypeMajorVersion != null : !MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT.equals(minExtendedResourceTypeMajorVersion);
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				return MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT == null ? minExtendedResourceTypeMinorVersion != null : !MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT.equals(minExtendedResourceTypeMinorVersion);
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				return MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT == null ? minExtendedResourceTypeRevisionNumber != null : !MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT.equals(minExtendedResourceTypeRevisionNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				return MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT == null ? minExtendedResourceTypeBuildNumber != null : !MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT.equals(minExtendedResourceTypeBuildNumber);
			case CimPackage.CIM_SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				return targetOSTypes != null && !targetOSTypes.isEmpty();
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
		result.append(" (MajorVersion: ");
		result.append(majorVersion);
		result.append(", MinorVersion: ");
		result.append(minorVersion);
		result.append(", RevisionNumber: ");
		result.append(revisionNumber);
		result.append(", BuildNumber: ");
		result.append(buildNumber);
		result.append(", LargeBuildNumber: ");
		result.append(largeBuildNumber);
		result.append(", IsLargeBuildNumber: ");
		result.append(isLargeBuildNumber);
		result.append(", VersionString: ");
		result.append(versionString);
		result.append(", TargetOperatingSystems: ");
		result.append(targetOperatingSystems);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", Languages: ");
		result.append(languages);
		result.append(", Classifications: ");
		result.append(classifications);
		result.append(", ClassificationDescriptions: ");
		result.append(classificationDescriptions);
		result.append(", SerialNumber: ");
		result.append(serialNumber);
		result.append(", TargetTypes: ");
		result.append(targetTypes);
		result.append(", IdentityInfoValue: ");
		result.append(identityInfoValue);
		result.append(", IdentityInfoType: ");
		result.append(identityInfoType);
		result.append(", ReleaseDate: ");
		result.append(releaseDate);
		result.append(", IsEntity: ");
		result.append(isEntity);
		result.append(", ExtendedResourceType: ");
		result.append(extendedResourceType);
		result.append(", OtherExtendedResourceTypeDescription: ");
		result.append(otherExtendedResourceTypeDescription);
		result.append(", MinExtendedResourceTypeMajorVersion: ");
		result.append(minExtendedResourceTypeMajorVersion);
		result.append(", MinExtendedResourceTypeMinorVersion: ");
		result.append(minExtendedResourceTypeMinorVersion);
		result.append(", MinExtendedResourceTypeRevisionNumber: ");
		result.append(minExtendedResourceTypeRevisionNumber);
		result.append(", MinExtendedResourceTypeBuildNumber: ");
		result.append(minExtendedResourceTypeBuildNumber);
		result.append(", TargetOSTypes: ");
		result.append(targetOSTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_SoftwareIdentityImpl
