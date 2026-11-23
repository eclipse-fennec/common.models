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

import org.dmtf.cim.CIM_JobCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Job Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getDeleteJobSupported <em>Delete Job Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getRequestedStatesSupported <em>Requested States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getInteractiveTimeoutMax <em>Interactive Timeout Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getDefaultValuesSupported <em>Default Values Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getClientRetriesMax <em>Client Retries Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getCleanupInterval <em>Cleanup Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getSilentModeSupported <em>Silent Mode Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getOtherCharacteristicsDescriptions <em>Other Characteristics Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getApplicableMethods <em>Applicable Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getTimeBeforeRemovalMin <em>Time Before Removal Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobCapabilitiesImpl#getTimeBeforeRemovalMax <em>Time Before Removal Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_JobCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_JobCapabilities {
	/**
	 * The default value of the '{@link #getDeleteJobSupported() <em>Delete Job Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteJobSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_JOB_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteJobSupported() <em>Delete Job Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteJobSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteJobSupported = DELETE_JOB_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestedStatesSupported() <em>Requested States Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedStatesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedStatesSupported;

	/**
	 * The default value of the '{@link #getInteractiveTimeoutMax() <em>Interactive Timeout Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveTimeoutMax()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERACTIVE_TIMEOUT_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInteractiveTimeoutMax() <em>Interactive Timeout Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveTimeoutMax()
	 * @generated
	 * @ordered
	 */
	protected String interactiveTimeoutMax = INTERACTIVE_TIMEOUT_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValuesSupported() <em>Default Values Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuesSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEFAULT_VALUES_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValuesSupported() <em>Default Values Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuesSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean defaultValuesSupported = DEFAULT_VALUES_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientRetriesMax() <em>Client Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRetriesMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLIENT_RETRIES_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientRetriesMax() <em>Client Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRetriesMax()
	 * @generated
	 * @ordered
	 */
	protected Long clientRetriesMax = CLIENT_RETRIES_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCleanupInterval() <em>Cleanup Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleanupInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEANUP_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCleanupInterval() <em>Cleanup Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleanupInterval()
	 * @generated
	 * @ordered
	 */
	protected String cleanupInterval = CLEANUP_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSilentModeSupported() <em>Silent Mode Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilentModeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SILENT_MODE_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSilentModeSupported() <em>Silent Mode Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilentModeSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean silentModeSupported = SILENT_MODE_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> characteristics;

	/**
	 * The cached value of the '{@link #getOtherCharacteristicsDescriptions() <em>Other Characteristics Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacteristicsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherCharacteristicsDescriptions;

	/**
	 * The cached value of the '{@link #getApplicableMethods() <em>Applicable Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> applicableMethods;

	/**
	 * The default value of the '{@link #getTimeBeforeRemovalMin() <em>Time Before Removal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemovalMin()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_BEFORE_REMOVAL_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeBeforeRemovalMin() <em>Time Before Removal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemovalMin()
	 * @generated
	 * @ordered
	 */
	protected String timeBeforeRemovalMin = TIME_BEFORE_REMOVAL_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeBeforeRemovalMax() <em>Time Before Removal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemovalMax()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_BEFORE_REMOVAL_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeBeforeRemovalMax() <em>Time Before Removal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemovalMax()
	 * @generated
	 * @ordered
	 */
	protected String timeBeforeRemovalMax = TIME_BEFORE_REMOVAL_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_JobCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_JobCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteJobSupported() {
		return deleteJobSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteJobSupported(Boolean newDeleteJobSupported) {
		Boolean oldDeleteJobSupported = deleteJobSupported;
		deleteJobSupported = newDeleteJobSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__DELETE_JOB_SUPPORTED, oldDeleteJobSupported, deleteJobSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedStatesSupported() {
		if (requestedStatesSupported == null) {
			requestedStatesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_JOB_CAPABILITIES__REQUESTED_STATES_SUPPORTED);
		}
		return requestedStatesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInteractiveTimeoutMax() {
		return interactiveTimeoutMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteractiveTimeoutMax(String newInteractiveTimeoutMax) {
		String oldInteractiveTimeoutMax = interactiveTimeoutMax;
		interactiveTimeoutMax = newInteractiveTimeoutMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__INTERACTIVE_TIMEOUT_MAX, oldInteractiveTimeoutMax, interactiveTimeoutMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDefaultValuesSupported() {
		return defaultValuesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValuesSupported(Boolean newDefaultValuesSupported) {
		Boolean oldDefaultValuesSupported = defaultValuesSupported;
		defaultValuesSupported = newDefaultValuesSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__DEFAULT_VALUES_SUPPORTED, oldDefaultValuesSupported, defaultValuesSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClientRetriesMax() {
		return clientRetriesMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientRetriesMax(Long newClientRetriesMax) {
		Long oldClientRetriesMax = clientRetriesMax;
		clientRetriesMax = newClientRetriesMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__CLIENT_RETRIES_MAX, oldClientRetriesMax, clientRetriesMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCleanupInterval() {
		return cleanupInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleanupInterval(String newCleanupInterval) {
		String oldCleanupInterval = cleanupInterval;
		cleanupInterval = newCleanupInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__CLEANUP_INTERVAL, oldCleanupInterval, cleanupInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSilentModeSupported() {
		return silentModeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSilentModeSupported(Boolean newSilentModeSupported) {
		Boolean oldSilentModeSupported = silentModeSupported;
		silentModeSupported = newSilentModeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__SILENT_MODE_SUPPORTED, oldSilentModeSupported, silentModeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_JOB_CAPABILITIES__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherCharacteristicsDescriptions() {
		if (otherCharacteristicsDescriptions == null) {
			otherCharacteristicsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_JOB_CAPABILITIES__OTHER_CHARACTERISTICS_DESCRIPTIONS);
		}
		return otherCharacteristicsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getApplicableMethods() {
		if (applicableMethods == null) {
			applicableMethods = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_JOB_CAPABILITIES__APPLICABLE_METHODS);
		}
		return applicableMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeBeforeRemovalMin() {
		return timeBeforeRemovalMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeBeforeRemovalMin(String newTimeBeforeRemovalMin) {
		String oldTimeBeforeRemovalMin = timeBeforeRemovalMin;
		timeBeforeRemovalMin = newTimeBeforeRemovalMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MIN, oldTimeBeforeRemovalMin, timeBeforeRemovalMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeBeforeRemovalMax() {
		return timeBeforeRemovalMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeBeforeRemovalMax(String newTimeBeforeRemovalMax) {
		String oldTimeBeforeRemovalMax = timeBeforeRemovalMax;
		timeBeforeRemovalMax = newTimeBeforeRemovalMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MAX, oldTimeBeforeRemovalMax, timeBeforeRemovalMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_JOB_CAPABILITIES__DELETE_JOB_SUPPORTED:
				return getDeleteJobSupported();
			case CimPackage.CIM_JOB_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				return getRequestedStatesSupported();
			case CimPackage.CIM_JOB_CAPABILITIES__INTERACTIVE_TIMEOUT_MAX:
				return getInteractiveTimeoutMax();
			case CimPackage.CIM_JOB_CAPABILITIES__DEFAULT_VALUES_SUPPORTED:
				return getDefaultValuesSupported();
			case CimPackage.CIM_JOB_CAPABILITIES__CLIENT_RETRIES_MAX:
				return getClientRetriesMax();
			case CimPackage.CIM_JOB_CAPABILITIES__CLEANUP_INTERVAL:
				return getCleanupInterval();
			case CimPackage.CIM_JOB_CAPABILITIES__SILENT_MODE_SUPPORTED:
				return getSilentModeSupported();
			case CimPackage.CIM_JOB_CAPABILITIES__CHARACTERISTICS:
				return getCharacteristics();
			case CimPackage.CIM_JOB_CAPABILITIES__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				return getOtherCharacteristicsDescriptions();
			case CimPackage.CIM_JOB_CAPABILITIES__APPLICABLE_METHODS:
				return getApplicableMethods();
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MIN:
				return getTimeBeforeRemovalMin();
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MAX:
				return getTimeBeforeRemovalMax();
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
			case CimPackage.CIM_JOB_CAPABILITIES__DELETE_JOB_SUPPORTED:
				setDeleteJobSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				getRequestedStatesSupported().clear();
				getRequestedStatesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__INTERACTIVE_TIMEOUT_MAX:
				setInteractiveTimeoutMax((String)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__DEFAULT_VALUES_SUPPORTED:
				setDefaultValuesSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__CLIENT_RETRIES_MAX:
				setClientRetriesMax((Long)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__CLEANUP_INTERVAL:
				setCleanupInterval((String)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__SILENT_MODE_SUPPORTED:
				setSilentModeSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				getOtherCharacteristicsDescriptions().clear();
				getOtherCharacteristicsDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__APPLICABLE_METHODS:
				getApplicableMethods().clear();
				getApplicableMethods().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MIN:
				setTimeBeforeRemovalMin((String)newValue);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MAX:
				setTimeBeforeRemovalMax((String)newValue);
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
			case CimPackage.CIM_JOB_CAPABILITIES__DELETE_JOB_SUPPORTED:
				setDeleteJobSupported(DELETE_JOB_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				getRequestedStatesSupported().clear();
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__INTERACTIVE_TIMEOUT_MAX:
				setInteractiveTimeoutMax(INTERACTIVE_TIMEOUT_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__DEFAULT_VALUES_SUPPORTED:
				setDefaultValuesSupported(DEFAULT_VALUES_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__CLIENT_RETRIES_MAX:
				setClientRetriesMax(CLIENT_RETRIES_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__CLEANUP_INTERVAL:
				setCleanupInterval(CLEANUP_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__SILENT_MODE_SUPPORTED:
				setSilentModeSupported(SILENT_MODE_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__CHARACTERISTICS:
				getCharacteristics().clear();
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				getOtherCharacteristicsDescriptions().clear();
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__APPLICABLE_METHODS:
				getApplicableMethods().clear();
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MIN:
				setTimeBeforeRemovalMin(TIME_BEFORE_REMOVAL_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MAX:
				setTimeBeforeRemovalMax(TIME_BEFORE_REMOVAL_MAX_EDEFAULT);
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
			case CimPackage.CIM_JOB_CAPABILITIES__DELETE_JOB_SUPPORTED:
				return DELETE_JOB_SUPPORTED_EDEFAULT == null ? deleteJobSupported != null : !DELETE_JOB_SUPPORTED_EDEFAULT.equals(deleteJobSupported);
			case CimPackage.CIM_JOB_CAPABILITIES__REQUESTED_STATES_SUPPORTED:
				return requestedStatesSupported != null && !requestedStatesSupported.isEmpty();
			case CimPackage.CIM_JOB_CAPABILITIES__INTERACTIVE_TIMEOUT_MAX:
				return INTERACTIVE_TIMEOUT_MAX_EDEFAULT == null ? interactiveTimeoutMax != null : !INTERACTIVE_TIMEOUT_MAX_EDEFAULT.equals(interactiveTimeoutMax);
			case CimPackage.CIM_JOB_CAPABILITIES__DEFAULT_VALUES_SUPPORTED:
				return DEFAULT_VALUES_SUPPORTED_EDEFAULT == null ? defaultValuesSupported != null : !DEFAULT_VALUES_SUPPORTED_EDEFAULT.equals(defaultValuesSupported);
			case CimPackage.CIM_JOB_CAPABILITIES__CLIENT_RETRIES_MAX:
				return CLIENT_RETRIES_MAX_EDEFAULT == null ? clientRetriesMax != null : !CLIENT_RETRIES_MAX_EDEFAULT.equals(clientRetriesMax);
			case CimPackage.CIM_JOB_CAPABILITIES__CLEANUP_INTERVAL:
				return CLEANUP_INTERVAL_EDEFAULT == null ? cleanupInterval != null : !CLEANUP_INTERVAL_EDEFAULT.equals(cleanupInterval);
			case CimPackage.CIM_JOB_CAPABILITIES__SILENT_MODE_SUPPORTED:
				return SILENT_MODE_SUPPORTED_EDEFAULT == null ? silentModeSupported != null : !SILENT_MODE_SUPPORTED_EDEFAULT.equals(silentModeSupported);
			case CimPackage.CIM_JOB_CAPABILITIES__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
			case CimPackage.CIM_JOB_CAPABILITIES__OTHER_CHARACTERISTICS_DESCRIPTIONS:
				return otherCharacteristicsDescriptions != null && !otherCharacteristicsDescriptions.isEmpty();
			case CimPackage.CIM_JOB_CAPABILITIES__APPLICABLE_METHODS:
				return applicableMethods != null && !applicableMethods.isEmpty();
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MIN:
				return TIME_BEFORE_REMOVAL_MIN_EDEFAULT == null ? timeBeforeRemovalMin != null : !TIME_BEFORE_REMOVAL_MIN_EDEFAULT.equals(timeBeforeRemovalMin);
			case CimPackage.CIM_JOB_CAPABILITIES__TIME_BEFORE_REMOVAL_MAX:
				return TIME_BEFORE_REMOVAL_MAX_EDEFAULT == null ? timeBeforeRemovalMax != null : !TIME_BEFORE_REMOVAL_MAX_EDEFAULT.equals(timeBeforeRemovalMax);
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
		result.append(" (DeleteJobSupported: ");
		result.append(deleteJobSupported);
		result.append(", RequestedStatesSupported: ");
		result.append(requestedStatesSupported);
		result.append(", InteractiveTimeoutMax: ");
		result.append(interactiveTimeoutMax);
		result.append(", DefaultValuesSupported: ");
		result.append(defaultValuesSupported);
		result.append(", ClientRetriesMax: ");
		result.append(clientRetriesMax);
		result.append(", CleanupInterval: ");
		result.append(cleanupInterval);
		result.append(", SilentModeSupported: ");
		result.append(silentModeSupported);
		result.append(", Characteristics: ");
		result.append(characteristics);
		result.append(", OtherCharacteristicsDescriptions: ");
		result.append(otherCharacteristicsDescriptions);
		result.append(", ApplicableMethods: ");
		result.append(applicableMethods);
		result.append(", TimeBeforeRemovalMin: ");
		result.append(timeBeforeRemovalMin);
		result.append(", TimeBeforeRemovalMax: ");
		result.append(timeBeforeRemovalMax);
		result.append(')');
		return result.toString();
	}

} //CIM_JobCapabilitiesImpl
