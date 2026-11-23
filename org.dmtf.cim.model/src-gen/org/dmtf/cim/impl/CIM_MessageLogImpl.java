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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_MessageLog;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Message Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getCapabilitiesDescriptions <em>Capabilities Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getMaxLogSize <em>Max Log Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getSizeOfHeader <em>Size Of Header</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getHeaderFormat <em>Header Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getMaxRecordSize <em>Max Record Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getSizeOfRecordHeader <em>Size Of Record Header</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getRecordHeaderFormat <em>Record Header Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getOtherPolicyDescription <em>Other Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getTimeWhenOutdated <em>Time When Outdated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getPercentageNearFull <em>Percentage Near Full</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getLastChange <em>Last Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getTimeOfLastChange <em>Time Of Last Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getRecordLastChanged <em>Record Last Changed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getIsFrozen <em>Is Frozen</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageLogImpl#getCharacterSet <em>Character Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MessageLogImpl extends CIM_LogImpl implements CIM_MessageLog {
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
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilitiesDescriptions() <em>Capabilities Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilitiesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilitiesDescriptions;

	/**
	 * The default value of the '{@link #getMaxLogSize() <em>Max Log Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLogSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_LOG_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLogSize() <em>Max Log Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLogSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxLogSize = MAX_LOG_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeOfHeader() <em>Size Of Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfHeader()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_OF_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeOfHeader() <em>Size Of Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfHeader()
	 * @generated
	 * @ordered
	 */
	protected Long sizeOfHeader = SIZE_OF_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderFormat() <em>Header Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderFormat() <em>Header Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderFormat()
	 * @generated
	 * @ordered
	 */
	protected String headerFormat = HEADER_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRecordSize() <em>Max Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRecordSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_RECORD_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRecordSize() <em>Max Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRecordSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxRecordSize = MAX_RECORD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeOfRecordHeader() <em>Size Of Record Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfRecordHeader()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_OF_RECORD_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeOfRecordHeader() <em>Size Of Record Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfRecordHeader()
	 * @generated
	 * @ordered
	 */
	protected Long sizeOfRecordHeader = SIZE_OF_RECORD_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordHeaderFormat() <em>Record Header Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordHeaderFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_HEADER_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordHeaderFormat() <em>Record Header Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordHeaderFormat()
	 * @generated
	 * @ordered
	 */
	protected String recordHeaderFormat = RECORD_HEADER_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPolicyDescription() <em>Other Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_POLICY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPolicyDescription() <em>Other Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherPolicyDescription = OTHER_POLICY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeWhenOutdated() <em>Time When Outdated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWhenOutdated()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_WHEN_OUTDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeWhenOutdated() <em>Time When Outdated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWhenOutdated()
	 * @generated
	 * @ordered
	 */
	protected String timeWhenOutdated = TIME_WHEN_OUTDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageNearFull() <em>Percentage Near Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageNearFull()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENTAGE_NEAR_FULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentageNearFull() <em>Percentage Near Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageNearFull()
	 * @generated
	 * @ordered
	 */
	protected Integer percentageNearFull = PERCENTAGE_NEAR_FULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastChange() <em>Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChange()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastChange() <em>Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChange()
	 * @generated
	 * @ordered
	 */
	protected Integer lastChange = LAST_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastChange() <em>Time Of Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastChange()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastChange() <em>Time Of Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastChange()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastChange = TIME_OF_LAST_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordLastChanged() <em>Record Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLastChanged()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECORD_LAST_CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordLastChanged() <em>Record Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLastChanged()
	 * @generated
	 * @ordered
	 */
	protected Long recordLastChanged = RECORD_LAST_CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFrozen() <em>Is Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FROZEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFrozen() <em>Is Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFrozen()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFrozen = IS_FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterSet() <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARACTER_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterSet() <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected Integer characterSet = CHARACTER_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MessageLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MessageLog();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MESSAGE_LOG__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilitiesDescriptions() {
		if (capabilitiesDescriptions == null) {
			capabilitiesDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_MESSAGE_LOG__CAPABILITIES_DESCRIPTIONS);
		}
		return capabilitiesDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxLogSize() {
		return maxLogSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLogSize(Long newMaxLogSize) {
		Long oldMaxLogSize = maxLogSize;
		maxLogSize = newMaxLogSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__MAX_LOG_SIZE, oldMaxLogSize, maxLogSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSizeOfHeader() {
		return sizeOfHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeOfHeader(Long newSizeOfHeader) {
		Long oldSizeOfHeader = sizeOfHeader;
		sizeOfHeader = newSizeOfHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__SIZE_OF_HEADER, oldSizeOfHeader, sizeOfHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderFormat() {
		return headerFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderFormat(String newHeaderFormat) {
		String oldHeaderFormat = headerFormat;
		headerFormat = newHeaderFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__HEADER_FORMAT, oldHeaderFormat, headerFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxRecordSize() {
		return maxRecordSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRecordSize(Long newMaxRecordSize) {
		Long oldMaxRecordSize = maxRecordSize;
		maxRecordSize = newMaxRecordSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__MAX_RECORD_SIZE, oldMaxRecordSize, maxRecordSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSizeOfRecordHeader() {
		return sizeOfRecordHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeOfRecordHeader(Long newSizeOfRecordHeader) {
		Long oldSizeOfRecordHeader = sizeOfRecordHeader;
		sizeOfRecordHeader = newSizeOfRecordHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__SIZE_OF_RECORD_HEADER, oldSizeOfRecordHeader, sizeOfRecordHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordHeaderFormat() {
		return recordHeaderFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordHeaderFormat(String newRecordHeaderFormat) {
		String oldRecordHeaderFormat = recordHeaderFormat;
		recordHeaderFormat = newRecordHeaderFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__RECORD_HEADER_FORMAT, oldRecordHeaderFormat, recordHeaderFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPolicyDescription() {
		return otherPolicyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPolicyDescription(String newOtherPolicyDescription) {
		String oldOtherPolicyDescription = otherPolicyDescription;
		otherPolicyDescription = newOtherPolicyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__OTHER_POLICY_DESCRIPTION, oldOtherPolicyDescription, otherPolicyDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeWhenOutdated() {
		return timeWhenOutdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeWhenOutdated(String newTimeWhenOutdated) {
		String oldTimeWhenOutdated = timeWhenOutdated;
		timeWhenOutdated = newTimeWhenOutdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__TIME_WHEN_OUTDATED, oldTimeWhenOutdated, timeWhenOutdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentageNearFull() {
		return percentageNearFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageNearFull(Integer newPercentageNearFull) {
		Integer oldPercentageNearFull = percentageNearFull;
		percentageNearFull = newPercentageNearFull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__PERCENTAGE_NEAR_FULL, oldPercentageNearFull, percentageNearFull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastChange() {
		return lastChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastChange(Integer newLastChange) {
		Integer oldLastChange = lastChange;
		lastChange = newLastChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__LAST_CHANGE, oldLastChange, lastChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastChange() {
		return timeOfLastChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastChange(String newTimeOfLastChange) {
		String oldTimeOfLastChange = timeOfLastChange;
		timeOfLastChange = newTimeOfLastChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__TIME_OF_LAST_CHANGE, oldTimeOfLastChange, timeOfLastChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRecordLastChanged() {
		return recordLastChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordLastChanged(Long newRecordLastChanged) {
		Long oldRecordLastChanged = recordLastChanged;
		recordLastChanged = newRecordLastChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__RECORD_LAST_CHANGED, oldRecordLastChanged, recordLastChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsFrozen() {
		return isFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFrozen(Boolean newIsFrozen) {
		Boolean oldIsFrozen = isFrozen;
		isFrozen = newIsFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__IS_FROZEN, oldIsFrozen, isFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCharacterSet() {
		return characterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterSet(Integer newCharacterSet) {
		Integer oldCharacterSet = characterSet;
		characterSet = newCharacterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE_LOG__CHARACTER_SET, oldCharacterSet, characterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long PositionToFirstRecord(String IterationIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long PositionAtRecord(String IterationIdentifier, Boolean MoveAbsolute, Long RecordNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetRecord(String IterationIdentifier, Boolean PositionToNext, Long RecordNumber, EList<Integer> RecordData) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long DeleteRecord(String IterationIdentifier, Boolean PositionToNext, Long RecordNumber, EList<Integer> RecordData) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long WriteRecord(String IterationIdentifier, Boolean PositionToNext, EList<Integer> RecordData, Long RecordNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CancelIteration(String IterationIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long FreezeLog(Boolean Freeze) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long FlagRecordForOverwrite(String IterationIdentifier, Boolean PositionToNext, Long RecordNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MESSAGE_LOG__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES_DESCRIPTIONS:
				return getCapabilitiesDescriptions();
			case CimPackage.CIM_MESSAGE_LOG__MAX_LOG_SIZE:
				return getMaxLogSize();
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_HEADER:
				return getSizeOfHeader();
			case CimPackage.CIM_MESSAGE_LOG__HEADER_FORMAT:
				return getHeaderFormat();
			case CimPackage.CIM_MESSAGE_LOG__MAX_RECORD_SIZE:
				return getMaxRecordSize();
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_RECORD_HEADER:
				return getSizeOfRecordHeader();
			case CimPackage.CIM_MESSAGE_LOG__RECORD_HEADER_FORMAT:
				return getRecordHeaderFormat();
			case CimPackage.CIM_MESSAGE_LOG__OTHER_POLICY_DESCRIPTION:
				return getOtherPolicyDescription();
			case CimPackage.CIM_MESSAGE_LOG__TIME_WHEN_OUTDATED:
				return getTimeWhenOutdated();
			case CimPackage.CIM_MESSAGE_LOG__PERCENTAGE_NEAR_FULL:
				return getPercentageNearFull();
			case CimPackage.CIM_MESSAGE_LOG__LAST_CHANGE:
				return getLastChange();
			case CimPackage.CIM_MESSAGE_LOG__TIME_OF_LAST_CHANGE:
				return getTimeOfLastChange();
			case CimPackage.CIM_MESSAGE_LOG__RECORD_LAST_CHANGED:
				return getRecordLastChanged();
			case CimPackage.CIM_MESSAGE_LOG__IS_FROZEN:
				return getIsFrozen();
			case CimPackage.CIM_MESSAGE_LOG__CHARACTER_SET:
				return getCharacterSet();
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
			case CimPackage.CIM_MESSAGE_LOG__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES_DESCRIPTIONS:
				getCapabilitiesDescriptions().clear();
				getCapabilitiesDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__MAX_LOG_SIZE:
				setMaxLogSize((Long)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_HEADER:
				setSizeOfHeader((Long)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__HEADER_FORMAT:
				setHeaderFormat((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__MAX_RECORD_SIZE:
				setMaxRecordSize((Long)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_RECORD_HEADER:
				setSizeOfRecordHeader((Long)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__RECORD_HEADER_FORMAT:
				setRecordHeaderFormat((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__OTHER_POLICY_DESCRIPTION:
				setOtherPolicyDescription((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__TIME_WHEN_OUTDATED:
				setTimeWhenOutdated((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__PERCENTAGE_NEAR_FULL:
				setPercentageNearFull((Integer)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__LAST_CHANGE:
				setLastChange((Integer)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__TIME_OF_LAST_CHANGE:
				setTimeOfLastChange((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__RECORD_LAST_CHANGED:
				setRecordLastChanged((Long)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__IS_FROZEN:
				setIsFrozen((Boolean)newValue);
				return;
			case CimPackage.CIM_MESSAGE_LOG__CHARACTER_SET:
				setCharacterSet((Integer)newValue);
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
			case CimPackage.CIM_MESSAGE_LOG__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES_DESCRIPTIONS:
				getCapabilitiesDescriptions().clear();
				return;
			case CimPackage.CIM_MESSAGE_LOG__MAX_LOG_SIZE:
				setMaxLogSize(MAX_LOG_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_HEADER:
				setSizeOfHeader(SIZE_OF_HEADER_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__HEADER_FORMAT:
				setHeaderFormat(HEADER_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__MAX_RECORD_SIZE:
				setMaxRecordSize(MAX_RECORD_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_RECORD_HEADER:
				setSizeOfRecordHeader(SIZE_OF_RECORD_HEADER_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__RECORD_HEADER_FORMAT:
				setRecordHeaderFormat(RECORD_HEADER_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__OTHER_POLICY_DESCRIPTION:
				setOtherPolicyDescription(OTHER_POLICY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__TIME_WHEN_OUTDATED:
				setTimeWhenOutdated(TIME_WHEN_OUTDATED_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__PERCENTAGE_NEAR_FULL:
				setPercentageNearFull(PERCENTAGE_NEAR_FULL_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__LAST_CHANGE:
				setLastChange(LAST_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__TIME_OF_LAST_CHANGE:
				setTimeOfLastChange(TIME_OF_LAST_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__RECORD_LAST_CHANGED:
				setRecordLastChanged(RECORD_LAST_CHANGED_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__IS_FROZEN:
				setIsFrozen(IS_FROZEN_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE_LOG__CHARACTER_SET:
				setCharacterSet(CHARACTER_SET_EDEFAULT);
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
			case CimPackage.CIM_MESSAGE_LOG__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_MESSAGE_LOG__CAPABILITIES_DESCRIPTIONS:
				return capabilitiesDescriptions != null && !capabilitiesDescriptions.isEmpty();
			case CimPackage.CIM_MESSAGE_LOG__MAX_LOG_SIZE:
				return MAX_LOG_SIZE_EDEFAULT == null ? maxLogSize != null : !MAX_LOG_SIZE_EDEFAULT.equals(maxLogSize);
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_HEADER:
				return SIZE_OF_HEADER_EDEFAULT == null ? sizeOfHeader != null : !SIZE_OF_HEADER_EDEFAULT.equals(sizeOfHeader);
			case CimPackage.CIM_MESSAGE_LOG__HEADER_FORMAT:
				return HEADER_FORMAT_EDEFAULT == null ? headerFormat != null : !HEADER_FORMAT_EDEFAULT.equals(headerFormat);
			case CimPackage.CIM_MESSAGE_LOG__MAX_RECORD_SIZE:
				return MAX_RECORD_SIZE_EDEFAULT == null ? maxRecordSize != null : !MAX_RECORD_SIZE_EDEFAULT.equals(maxRecordSize);
			case CimPackage.CIM_MESSAGE_LOG__SIZE_OF_RECORD_HEADER:
				return SIZE_OF_RECORD_HEADER_EDEFAULT == null ? sizeOfRecordHeader != null : !SIZE_OF_RECORD_HEADER_EDEFAULT.equals(sizeOfRecordHeader);
			case CimPackage.CIM_MESSAGE_LOG__RECORD_HEADER_FORMAT:
				return RECORD_HEADER_FORMAT_EDEFAULT == null ? recordHeaderFormat != null : !RECORD_HEADER_FORMAT_EDEFAULT.equals(recordHeaderFormat);
			case CimPackage.CIM_MESSAGE_LOG__OTHER_POLICY_DESCRIPTION:
				return OTHER_POLICY_DESCRIPTION_EDEFAULT == null ? otherPolicyDescription != null : !OTHER_POLICY_DESCRIPTION_EDEFAULT.equals(otherPolicyDescription);
			case CimPackage.CIM_MESSAGE_LOG__TIME_WHEN_OUTDATED:
				return TIME_WHEN_OUTDATED_EDEFAULT == null ? timeWhenOutdated != null : !TIME_WHEN_OUTDATED_EDEFAULT.equals(timeWhenOutdated);
			case CimPackage.CIM_MESSAGE_LOG__PERCENTAGE_NEAR_FULL:
				return PERCENTAGE_NEAR_FULL_EDEFAULT == null ? percentageNearFull != null : !PERCENTAGE_NEAR_FULL_EDEFAULT.equals(percentageNearFull);
			case CimPackage.CIM_MESSAGE_LOG__LAST_CHANGE:
				return LAST_CHANGE_EDEFAULT == null ? lastChange != null : !LAST_CHANGE_EDEFAULT.equals(lastChange);
			case CimPackage.CIM_MESSAGE_LOG__TIME_OF_LAST_CHANGE:
				return TIME_OF_LAST_CHANGE_EDEFAULT == null ? timeOfLastChange != null : !TIME_OF_LAST_CHANGE_EDEFAULT.equals(timeOfLastChange);
			case CimPackage.CIM_MESSAGE_LOG__RECORD_LAST_CHANGED:
				return RECORD_LAST_CHANGED_EDEFAULT == null ? recordLastChanged != null : !RECORD_LAST_CHANGED_EDEFAULT.equals(recordLastChanged);
			case CimPackage.CIM_MESSAGE_LOG__IS_FROZEN:
				return IS_FROZEN_EDEFAULT == null ? isFrozen != null : !IS_FROZEN_EDEFAULT.equals(isFrozen);
			case CimPackage.CIM_MESSAGE_LOG__CHARACTER_SET:
				return CHARACTER_SET_EDEFAULT == null ? characterSet != null : !CHARACTER_SET_EDEFAULT.equals(characterSet);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_MESSAGE_LOG___POSITION_TO_FIRST_RECORD__STRING:
				return PositionToFirstRecord((String)arguments.get(0));
			case CimPackage.CIM_MESSAGE_LOG___POSITION_AT_RECORD__STRING_BOOLEAN_LONG:
				return PositionAtRecord((String)arguments.get(0), (Boolean)arguments.get(1), (Long)arguments.get(2));
			case CimPackage.CIM_MESSAGE_LOG___GET_RECORD__STRING_BOOLEAN_LONG_ELIST:
				return GetRecord((String)arguments.get(0), (Boolean)arguments.get(1), (Long)arguments.get(2), (EList<Integer>)arguments.get(3));
			case CimPackage.CIM_MESSAGE_LOG___DELETE_RECORD__STRING_BOOLEAN_LONG_ELIST:
				return DeleteRecord((String)arguments.get(0), (Boolean)arguments.get(1), (Long)arguments.get(2), (EList<Integer>)arguments.get(3));
			case CimPackage.CIM_MESSAGE_LOG___WRITE_RECORD__STRING_BOOLEAN_ELIST_LONG:
				return WriteRecord((String)arguments.get(0), (Boolean)arguments.get(1), (EList<Integer>)arguments.get(2), (Long)arguments.get(3));
			case CimPackage.CIM_MESSAGE_LOG___CANCEL_ITERATION__STRING:
				return CancelIteration((String)arguments.get(0));
			case CimPackage.CIM_MESSAGE_LOG___FREEZE_LOG__BOOLEAN:
				return FreezeLog((Boolean)arguments.get(0));
			case CimPackage.CIM_MESSAGE_LOG___FLAG_RECORD_FOR_OVERWRITE__STRING_BOOLEAN_LONG:
				return FlagRecordForOverwrite((String)arguments.get(0), (Boolean)arguments.get(1), (Long)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (CreationClassName: ");
		result.append(creationClassName);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilitiesDescriptions: ");
		result.append(capabilitiesDescriptions);
		result.append(", MaxLogSize: ");
		result.append(maxLogSize);
		result.append(", SizeOfHeader: ");
		result.append(sizeOfHeader);
		result.append(", HeaderFormat: ");
		result.append(headerFormat);
		result.append(", MaxRecordSize: ");
		result.append(maxRecordSize);
		result.append(", SizeOfRecordHeader: ");
		result.append(sizeOfRecordHeader);
		result.append(", RecordHeaderFormat: ");
		result.append(recordHeaderFormat);
		result.append(", OtherPolicyDescription: ");
		result.append(otherPolicyDescription);
		result.append(", TimeWhenOutdated: ");
		result.append(timeWhenOutdated);
		result.append(", PercentageNearFull: ");
		result.append(percentageNearFull);
		result.append(", LastChange: ");
		result.append(lastChange);
		result.append(", TimeOfLastChange: ");
		result.append(timeOfLastChange);
		result.append(", RecordLastChanged: ");
		result.append(recordLastChanged);
		result.append(", IsFrozen: ");
		result.append(isFrozen);
		result.append(", CharacterSet: ");
		result.append(characterSet);
		result.append(')');
		return result.toString();
	}

} //CIM_MessageLogImpl
