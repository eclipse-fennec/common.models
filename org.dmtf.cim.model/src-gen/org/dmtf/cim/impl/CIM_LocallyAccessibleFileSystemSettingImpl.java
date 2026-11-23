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

import org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Locally Accessible File System Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getFailurePolicy <em>Failure Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getRetriesMax <em>Retries Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getInitialEnabledState <em>Initial Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getRequestRetryPolicy <em>Request Retry Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getTransmissionRetriesMax <em>Transmission Retries Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getRetransmissionTimeoutMin <em>Retransmission Timeout Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getCachingOptions <em>Caching Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getBuffersSupport <em>Buffers Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getReadBufferSizeMin <em>Read Buffer Size Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getReadBufferSizeMax <em>Read Buffer Size Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getWriteBufferSizeMin <em>Write Buffer Size Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getWriteBufferSizeMax <em>Write Buffer Size Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getAttributeCaching <em>Attribute Caching</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getAttributeCachingObjects <em>Attribute Caching Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getAttributeCachingTimeMin <em>Attribute Caching Time Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getAttributeCachingTimeMax <em>Attribute Caching Time Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getReadWritePolicy <em>Read Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getEnableOnSystemStart <em>Enable On System Start</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getReadWritePref <em>Read Write Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getExecutePref <em>Execute Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemSettingImpl#getRootAccessPref <em>Root Access Pref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LocallyAccessibleFileSystemSettingImpl extends CIM_SettingDataImpl implements CIM_LocallyAccessibleFileSystemSetting {
	/**
	 * The default value of the '{@link #getFailurePolicy() <em>Failure Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailurePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FAILURE_POLICY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getFailurePolicy() <em>Failure Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailurePolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer failurePolicy = FAILURE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetriesMax() <em>Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetriesMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long RETRIES_MAX_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getRetriesMax() <em>Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetriesMax()
	 * @generated
	 * @ordered
	 */
	protected Long retriesMax = RETRIES_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialEnabledState() <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_ENABLED_STATE_EDEFAULT = Integer.valueOf(8);

	/**
	 * The cached value of the '{@link #getInitialEnabledState() <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer initialEnabledState = INITIAL_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledState = OTHER_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestRetryPolicy() <em>Request Retry Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestRetryPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUEST_RETRY_POLICY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getRequestRetryPolicy() <em>Request Retry Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestRetryPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer requestRetryPolicy = REQUEST_RETRY_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmissionRetriesMax() <em>Transmission Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRetriesMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRANSMISSION_RETRIES_MAX_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getTransmissionRetriesMax() <em>Transmission Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRetriesMax()
	 * @generated
	 * @ordered
	 */
	protected Long transmissionRetriesMax = TRANSMISSION_RETRIES_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetransmissionTimeoutMin() <em>Retransmission Timeout Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmissionTimeoutMin()
	 * @generated
	 * @ordered
	 */
	protected static final Long RETRANSMISSION_TIMEOUT_MIN_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getRetransmissionTimeoutMin() <em>Retransmission Timeout Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmissionTimeoutMin()
	 * @generated
	 * @ordered
	 */
	protected Long retransmissionTimeoutMin = RETRANSMISSION_TIMEOUT_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCachingOptions() <em>Caching Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingOptions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CACHING_OPTIONS_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getCachingOptions() <em>Caching Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingOptions()
	 * @generated
	 * @ordered
	 */
	protected Integer cachingOptions = CACHING_OPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuffersSupport() <em>Buffers Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffersSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> buffersSupport;

	/**
	 * The default value of the '{@link #getReadBufferSizeMin() <em>Read Buffer Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBufferSizeMin()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_BUFFER_SIZE_MIN_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getReadBufferSizeMin() <em>Read Buffer Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBufferSizeMin()
	 * @generated
	 * @ordered
	 */
	protected Long readBufferSizeMin = READ_BUFFER_SIZE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadBufferSizeMax() <em>Read Buffer Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBufferSizeMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_BUFFER_SIZE_MAX_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getReadBufferSizeMax() <em>Read Buffer Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBufferSizeMax()
	 * @generated
	 * @ordered
	 */
	protected Long readBufferSizeMax = READ_BUFFER_SIZE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteBufferSizeMin() <em>Write Buffer Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBufferSizeMin()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_BUFFER_SIZE_MIN_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getWriteBufferSizeMin() <em>Write Buffer Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBufferSizeMin()
	 * @generated
	 * @ordered
	 */
	protected Long writeBufferSizeMin = WRITE_BUFFER_SIZE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteBufferSizeMax() <em>Write Buffer Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBufferSizeMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_BUFFER_SIZE_MAX_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getWriteBufferSizeMax() <em>Write Buffer Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBufferSizeMax()
	 * @generated
	 * @ordered
	 */
	protected Long writeBufferSizeMax = WRITE_BUFFER_SIZE_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeCaching() <em>Attribute Caching</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCaching()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> attributeCaching;

	/**
	 * The cached value of the '{@link #getAttributeCachingObjects() <em>Attribute Caching Objects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> attributeCachingObjects;

	/**
	 * The cached value of the '{@link #getAttributeCachingTimeMin() <em>Attribute Caching Time Min</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingTimeMin()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> attributeCachingTimeMin;

	/**
	 * The cached value of the '{@link #getAttributeCachingTimeMax() <em>Attribute Caching Time Max</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingTimeMax()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> attributeCachingTimeMax;

	/**
	 * The default value of the '{@link #getReadWritePolicy() <em>Read Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer READ_WRITE_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadWritePolicy() <em>Read Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer readWritePolicy = READ_WRITE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCK_POLICY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer lockPolicy = LOCK_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableOnSystemStart() <em>Enable On System Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableOnSystemStart()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENABLE_ON_SYSTEM_START_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getEnableOnSystemStart() <em>Enable On System Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableOnSystemStart()
	 * @generated
	 * @ordered
	 */
	protected Integer enableOnSystemStart = ENABLE_ON_SYSTEM_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadWritePref() <em>Read Write Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWritePref()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_WRITE_PREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadWritePref() <em>Read Write Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWritePref()
	 * @generated
	 * @ordered
	 */
	protected String readWritePref = READ_WRITE_PREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutePref() <em>Execute Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutePref()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXECUTE_PREF_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getExecutePref() <em>Execute Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutePref()
	 * @generated
	 * @ordered
	 */
	protected Integer executePref = EXECUTE_PREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootAccessPref() <em>Root Access Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootAccessPref()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ACCESS_PREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootAccessPref() <em>Root Access Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootAccessPref()
	 * @generated
	 * @ordered
	 */
	protected String rootAccessPref = ROOT_ACCESS_PREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LocallyAccessibleFileSystemSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LocallyAccessibleFileSystemSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFailurePolicy() {
		return failurePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailurePolicy(Integer newFailurePolicy) {
		Integer oldFailurePolicy = failurePolicy;
		failurePolicy = newFailurePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__FAILURE_POLICY, oldFailurePolicy, failurePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRetriesMax() {
		return retriesMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetriesMax(Long newRetriesMax) {
		Long oldRetriesMax = retriesMax;
		retriesMax = newRetriesMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRIES_MAX, oldRetriesMax, retriesMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialEnabledState() {
		return initialEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialEnabledState(Integer newInitialEnabledState) {
		Integer oldInitialEnabledState = initialEnabledState;
		initialEnabledState = newInitialEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__INITIAL_ENABLED_STATE, oldInitialEnabledState, initialEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEnabledState() {
		return otherEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEnabledState(String newOtherEnabledState) {
		String oldOtherEnabledState = otherEnabledState;
		otherEnabledState = newOtherEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__OTHER_ENABLED_STATE, oldOtherEnabledState, otherEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestRetryPolicy() {
		return requestRetryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestRetryPolicy(Integer newRequestRetryPolicy) {
		Integer oldRequestRetryPolicy = requestRetryPolicy;
		requestRetryPolicy = newRequestRetryPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__REQUEST_RETRY_POLICY, oldRequestRetryPolicy, requestRetryPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmissionRetriesMax() {
		return transmissionRetriesMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmissionRetriesMax(Long newTransmissionRetriesMax) {
		Long oldTransmissionRetriesMax = transmissionRetriesMax;
		transmissionRetriesMax = newTransmissionRetriesMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__TRANSMISSION_RETRIES_MAX, oldTransmissionRetriesMax, transmissionRetriesMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRetransmissionTimeoutMin() {
		return retransmissionTimeoutMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetransmissionTimeoutMin(Long newRetransmissionTimeoutMin) {
		Long oldRetransmissionTimeoutMin = retransmissionTimeoutMin;
		retransmissionTimeoutMin = newRetransmissionTimeoutMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRANSMISSION_TIMEOUT_MIN, oldRetransmissionTimeoutMin, retransmissionTimeoutMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCachingOptions() {
		return cachingOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachingOptions(Integer newCachingOptions) {
		Integer oldCachingOptions = cachingOptions;
		cachingOptions = newCachingOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__CACHING_OPTIONS, oldCachingOptions, cachingOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getBuffersSupport() {
		if (buffersSupport == null) {
			buffersSupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__BUFFERS_SUPPORT);
		}
		return buffersSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadBufferSizeMin() {
		return readBufferSizeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadBufferSizeMin(Long newReadBufferSizeMin) {
		Long oldReadBufferSizeMin = readBufferSizeMin;
		readBufferSizeMin = newReadBufferSizeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MIN, oldReadBufferSizeMin, readBufferSizeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadBufferSizeMax() {
		return readBufferSizeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadBufferSizeMax(Long newReadBufferSizeMax) {
		Long oldReadBufferSizeMax = readBufferSizeMax;
		readBufferSizeMax = newReadBufferSizeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MAX, oldReadBufferSizeMax, readBufferSizeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteBufferSizeMin() {
		return writeBufferSizeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteBufferSizeMin(Long newWriteBufferSizeMin) {
		Long oldWriteBufferSizeMin = writeBufferSizeMin;
		writeBufferSizeMin = newWriteBufferSizeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MIN, oldWriteBufferSizeMin, writeBufferSizeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteBufferSizeMax() {
		return writeBufferSizeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteBufferSizeMax(Long newWriteBufferSizeMax) {
		Long oldWriteBufferSizeMax = writeBufferSizeMax;
		writeBufferSizeMax = newWriteBufferSizeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MAX, oldWriteBufferSizeMax, writeBufferSizeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAttributeCaching() {
		if (attributeCaching == null) {
			attributeCaching = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING);
		}
		return attributeCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAttributeCachingObjects() {
		if (attributeCachingObjects == null) {
			attributeCachingObjects = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_OBJECTS);
		}
		return attributeCachingObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAttributeCachingTimeMin() {
		if (attributeCachingTimeMin == null) {
			attributeCachingTimeMin = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MIN);
		}
		return attributeCachingTimeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAttributeCachingTimeMax() {
		if (attributeCachingTimeMax == null) {
			attributeCachingTimeMax = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MAX);
		}
		return attributeCachingTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReadWritePolicy() {
		return readWritePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadWritePolicy(Integer newReadWritePolicy) {
		Integer oldReadWritePolicy = readWritePolicy;
		readWritePolicy = newReadWritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_POLICY, oldReadWritePolicy, readWritePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLockPolicy() {
		return lockPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockPolicy(Integer newLockPolicy) {
		Integer oldLockPolicy = lockPolicy;
		lockPolicy = newLockPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__LOCK_POLICY, oldLockPolicy, lockPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEnableOnSystemStart() {
		return enableOnSystemStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableOnSystemStart(Integer newEnableOnSystemStart) {
		Integer oldEnableOnSystemStart = enableOnSystemStart;
		enableOnSystemStart = newEnableOnSystemStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ENABLE_ON_SYSTEM_START, oldEnableOnSystemStart, enableOnSystemStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadWritePref() {
		return readWritePref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadWritePref(String newReadWritePref) {
		String oldReadWritePref = readWritePref;
		readWritePref = newReadWritePref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_PREF, oldReadWritePref, readWritePref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExecutePref() {
		return executePref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutePref(Integer newExecutePref) {
		Integer oldExecutePref = executePref;
		executePref = newExecutePref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__EXECUTE_PREF, oldExecutePref, executePref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootAccessPref() {
		return rootAccessPref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootAccessPref(String newRootAccessPref) {
		String oldRootAccessPref = rootAccessPref;
		rootAccessPref = newRootAccessPref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ROOT_ACCESS_PREF, oldRootAccessPref, rootAccessPref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__FAILURE_POLICY:
				return getFailurePolicy();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRIES_MAX:
				return getRetriesMax();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__INITIAL_ENABLED_STATE:
				return getInitialEnabledState();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__OTHER_ENABLED_STATE:
				return getOtherEnabledState();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__REQUEST_RETRY_POLICY:
				return getRequestRetryPolicy();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__TRANSMISSION_RETRIES_MAX:
				return getTransmissionRetriesMax();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRANSMISSION_TIMEOUT_MIN:
				return getRetransmissionTimeoutMin();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__CACHING_OPTIONS:
				return getCachingOptions();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__BUFFERS_SUPPORT:
				return getBuffersSupport();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MIN:
				return getReadBufferSizeMin();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MAX:
				return getReadBufferSizeMax();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MIN:
				return getWriteBufferSizeMin();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MAX:
				return getWriteBufferSizeMax();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING:
				return getAttributeCaching();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_OBJECTS:
				return getAttributeCachingObjects();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MIN:
				return getAttributeCachingTimeMin();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MAX:
				return getAttributeCachingTimeMax();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_POLICY:
				return getReadWritePolicy();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__LOCK_POLICY:
				return getLockPolicy();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ENABLE_ON_SYSTEM_START:
				return getEnableOnSystemStart();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_PREF:
				return getReadWritePref();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__EXECUTE_PREF:
				return getExecutePref();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ROOT_ACCESS_PREF:
				return getRootAccessPref();
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
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__FAILURE_POLICY:
				setFailurePolicy((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRIES_MAX:
				setRetriesMax((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__INITIAL_ENABLED_STATE:
				setInitialEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__OTHER_ENABLED_STATE:
				setOtherEnabledState((String)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__REQUEST_RETRY_POLICY:
				setRequestRetryPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__TRANSMISSION_RETRIES_MAX:
				setTransmissionRetriesMax((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRANSMISSION_TIMEOUT_MIN:
				setRetransmissionTimeoutMin((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__CACHING_OPTIONS:
				setCachingOptions((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__BUFFERS_SUPPORT:
				getBuffersSupport().clear();
				getBuffersSupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MIN:
				setReadBufferSizeMin((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MAX:
				setReadBufferSizeMax((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MIN:
				setWriteBufferSizeMin((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MAX:
				setWriteBufferSizeMax((Long)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING:
				getAttributeCaching().clear();
				getAttributeCaching().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_OBJECTS:
				getAttributeCachingObjects().clear();
				getAttributeCachingObjects().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MIN:
				getAttributeCachingTimeMin().clear();
				getAttributeCachingTimeMin().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MAX:
				getAttributeCachingTimeMax().clear();
				getAttributeCachingTimeMax().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_POLICY:
				setReadWritePolicy((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__LOCK_POLICY:
				setLockPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ENABLE_ON_SYSTEM_START:
				setEnableOnSystemStart((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_PREF:
				setReadWritePref((String)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__EXECUTE_PREF:
				setExecutePref((Integer)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ROOT_ACCESS_PREF:
				setRootAccessPref((String)newValue);
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
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__FAILURE_POLICY:
				setFailurePolicy(FAILURE_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRIES_MAX:
				setRetriesMax(RETRIES_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__INITIAL_ENABLED_STATE:
				setInitialEnabledState(INITIAL_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__OTHER_ENABLED_STATE:
				setOtherEnabledState(OTHER_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__REQUEST_RETRY_POLICY:
				setRequestRetryPolicy(REQUEST_RETRY_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__TRANSMISSION_RETRIES_MAX:
				setTransmissionRetriesMax(TRANSMISSION_RETRIES_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRANSMISSION_TIMEOUT_MIN:
				setRetransmissionTimeoutMin(RETRANSMISSION_TIMEOUT_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__CACHING_OPTIONS:
				setCachingOptions(CACHING_OPTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__BUFFERS_SUPPORT:
				getBuffersSupport().clear();
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MIN:
				setReadBufferSizeMin(READ_BUFFER_SIZE_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MAX:
				setReadBufferSizeMax(READ_BUFFER_SIZE_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MIN:
				setWriteBufferSizeMin(WRITE_BUFFER_SIZE_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MAX:
				setWriteBufferSizeMax(WRITE_BUFFER_SIZE_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING:
				getAttributeCaching().clear();
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_OBJECTS:
				getAttributeCachingObjects().clear();
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MIN:
				getAttributeCachingTimeMin().clear();
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MAX:
				getAttributeCachingTimeMax().clear();
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_POLICY:
				setReadWritePolicy(READ_WRITE_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__LOCK_POLICY:
				setLockPolicy(LOCK_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ENABLE_ON_SYSTEM_START:
				setEnableOnSystemStart(ENABLE_ON_SYSTEM_START_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_PREF:
				setReadWritePref(READ_WRITE_PREF_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__EXECUTE_PREF:
				setExecutePref(EXECUTE_PREF_EDEFAULT);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ROOT_ACCESS_PREF:
				setRootAccessPref(ROOT_ACCESS_PREF_EDEFAULT);
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
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__FAILURE_POLICY:
				return FAILURE_POLICY_EDEFAULT == null ? failurePolicy != null : !FAILURE_POLICY_EDEFAULT.equals(failurePolicy);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRIES_MAX:
				return RETRIES_MAX_EDEFAULT == null ? retriesMax != null : !RETRIES_MAX_EDEFAULT.equals(retriesMax);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__INITIAL_ENABLED_STATE:
				return INITIAL_ENABLED_STATE_EDEFAULT == null ? initialEnabledState != null : !INITIAL_ENABLED_STATE_EDEFAULT.equals(initialEnabledState);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__OTHER_ENABLED_STATE:
				return OTHER_ENABLED_STATE_EDEFAULT == null ? otherEnabledState != null : !OTHER_ENABLED_STATE_EDEFAULT.equals(otherEnabledState);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__REQUEST_RETRY_POLICY:
				return REQUEST_RETRY_POLICY_EDEFAULT == null ? requestRetryPolicy != null : !REQUEST_RETRY_POLICY_EDEFAULT.equals(requestRetryPolicy);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__TRANSMISSION_RETRIES_MAX:
				return TRANSMISSION_RETRIES_MAX_EDEFAULT == null ? transmissionRetriesMax != null : !TRANSMISSION_RETRIES_MAX_EDEFAULT.equals(transmissionRetriesMax);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__RETRANSMISSION_TIMEOUT_MIN:
				return RETRANSMISSION_TIMEOUT_MIN_EDEFAULT == null ? retransmissionTimeoutMin != null : !RETRANSMISSION_TIMEOUT_MIN_EDEFAULT.equals(retransmissionTimeoutMin);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__CACHING_OPTIONS:
				return CACHING_OPTIONS_EDEFAULT == null ? cachingOptions != null : !CACHING_OPTIONS_EDEFAULT.equals(cachingOptions);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__BUFFERS_SUPPORT:
				return buffersSupport != null && !buffersSupport.isEmpty();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MIN:
				return READ_BUFFER_SIZE_MIN_EDEFAULT == null ? readBufferSizeMin != null : !READ_BUFFER_SIZE_MIN_EDEFAULT.equals(readBufferSizeMin);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_BUFFER_SIZE_MAX:
				return READ_BUFFER_SIZE_MAX_EDEFAULT == null ? readBufferSizeMax != null : !READ_BUFFER_SIZE_MAX_EDEFAULT.equals(readBufferSizeMax);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MIN:
				return WRITE_BUFFER_SIZE_MIN_EDEFAULT == null ? writeBufferSizeMin != null : !WRITE_BUFFER_SIZE_MIN_EDEFAULT.equals(writeBufferSizeMin);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__WRITE_BUFFER_SIZE_MAX:
				return WRITE_BUFFER_SIZE_MAX_EDEFAULT == null ? writeBufferSizeMax != null : !WRITE_BUFFER_SIZE_MAX_EDEFAULT.equals(writeBufferSizeMax);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING:
				return attributeCaching != null && !attributeCaching.isEmpty();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_OBJECTS:
				return attributeCachingObjects != null && !attributeCachingObjects.isEmpty();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MIN:
				return attributeCachingTimeMin != null && !attributeCachingTimeMin.isEmpty();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ATTRIBUTE_CACHING_TIME_MAX:
				return attributeCachingTimeMax != null && !attributeCachingTimeMax.isEmpty();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_POLICY:
				return READ_WRITE_POLICY_EDEFAULT == null ? readWritePolicy != null : !READ_WRITE_POLICY_EDEFAULT.equals(readWritePolicy);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__LOCK_POLICY:
				return LOCK_POLICY_EDEFAULT == null ? lockPolicy != null : !LOCK_POLICY_EDEFAULT.equals(lockPolicy);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ENABLE_ON_SYSTEM_START:
				return ENABLE_ON_SYSTEM_START_EDEFAULT == null ? enableOnSystemStart != null : !ENABLE_ON_SYSTEM_START_EDEFAULT.equals(enableOnSystemStart);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__READ_WRITE_PREF:
				return READ_WRITE_PREF_EDEFAULT == null ? readWritePref != null : !READ_WRITE_PREF_EDEFAULT.equals(readWritePref);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__EXECUTE_PREF:
				return EXECUTE_PREF_EDEFAULT == null ? executePref != null : !EXECUTE_PREF_EDEFAULT.equals(executePref);
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING__ROOT_ACCESS_PREF:
				return ROOT_ACCESS_PREF_EDEFAULT == null ? rootAccessPref != null : !ROOT_ACCESS_PREF_EDEFAULT.equals(rootAccessPref);
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
		result.append(" (FailurePolicy: ");
		result.append(failurePolicy);
		result.append(", RetriesMax: ");
		result.append(retriesMax);
		result.append(", InitialEnabledState: ");
		result.append(initialEnabledState);
		result.append(", OtherEnabledState: ");
		result.append(otherEnabledState);
		result.append(", RequestRetryPolicy: ");
		result.append(requestRetryPolicy);
		result.append(", TransmissionRetriesMax: ");
		result.append(transmissionRetriesMax);
		result.append(", RetransmissionTimeoutMin: ");
		result.append(retransmissionTimeoutMin);
		result.append(", CachingOptions: ");
		result.append(cachingOptions);
		result.append(", BuffersSupport: ");
		result.append(buffersSupport);
		result.append(", ReadBufferSizeMin: ");
		result.append(readBufferSizeMin);
		result.append(", ReadBufferSizeMax: ");
		result.append(readBufferSizeMax);
		result.append(", WriteBufferSizeMin: ");
		result.append(writeBufferSizeMin);
		result.append(", WriteBufferSizeMax: ");
		result.append(writeBufferSizeMax);
		result.append(", AttributeCaching: ");
		result.append(attributeCaching);
		result.append(", AttributeCachingObjects: ");
		result.append(attributeCachingObjects);
		result.append(", AttributeCachingTimeMin: ");
		result.append(attributeCachingTimeMin);
		result.append(", AttributeCachingTimeMax: ");
		result.append(attributeCachingTimeMax);
		result.append(", ReadWritePolicy: ");
		result.append(readWritePolicy);
		result.append(", LockPolicy: ");
		result.append(lockPolicy);
		result.append(", EnableOnSystemStart: ");
		result.append(enableOnSystemStart);
		result.append(", ReadWritePref: ");
		result.append(readWritePref);
		result.append(", ExecutePref: ");
		result.append(executePref);
		result.append(", RootAccessPref: ");
		result.append(rootAccessPref);
		result.append(')');
		return result.toString();
	}

} //CIM_LocallyAccessibleFileSystemSettingImpl
