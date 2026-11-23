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

import org.dmtf.cim.CIM_NFS;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM NFS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getHardMount <em>Hard Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getForegroundMount <em>Foreground Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getInterrupt <em>Interrupt</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getMountFailureRetries <em>Mount Failure Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getRetransmissionAttempts <em>Retransmission Attempts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getRetransmissionTimeout <em>Retransmission Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getReadBufferSize <em>Read Buffer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getWriteBufferSize <em>Write Buffer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getServerCommunicationPort <em>Server Communication Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getAttributeCaching <em>Attribute Caching</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getAttributeCachingForRegularFilesMin <em>Attribute Caching For Regular Files Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getAttributeCachingForRegularFilesMax <em>Attribute Caching For Regular Files Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getAttributeCachingForDirectoriesMin <em>Attribute Caching For Directories Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSImpl#getAttributeCachingForDirectoriesMax <em>Attribute Caching For Directories Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NFSImpl extends CIM_RemoteFileSystemImpl implements CIM_NFS {
	/**
	 * The default value of the '{@link #getHardMount() <em>Hard Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardMount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HARD_MOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardMount() <em>Hard Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardMount()
	 * @generated
	 * @ordered
	 */
	protected Boolean hardMount = HARD_MOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForegroundMount() <em>Foreground Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundMount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FOREGROUND_MOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForegroundMount() <em>Foreground Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundMount()
	 * @generated
	 * @ordered
	 */
	protected Boolean foregroundMount = FOREGROUND_MOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterrupt() <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupt()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERRUPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterrupt() <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupt()
	 * @generated
	 * @ordered
	 */
	protected Boolean interrupt = INTERRUPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountFailureRetries() <em>Mount Failure Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountFailureRetries()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MOUNT_FAILURE_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountFailureRetries() <em>Mount Failure Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountFailureRetries()
	 * @generated
	 * @ordered
	 */
	protected Integer mountFailureRetries = MOUNT_FAILURE_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetransmissionAttempts() <em>Retransmission Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmissionAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETRANSMISSION_ATTEMPTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetransmissionAttempts() <em>Retransmission Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmissionAttempts()
	 * @generated
	 * @ordered
	 */
	protected Integer retransmissionAttempts = RETRANSMISSION_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetransmissionTimeout() <em>Retransmission Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmissionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long RETRANSMISSION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetransmissionTimeout() <em>Retransmission Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmissionTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long retransmissionTimeout = RETRANSMISSION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadBufferSize() <em>Read Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadBufferSize() <em>Read Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBufferSize()
	 * @generated
	 * @ordered
	 */
	protected Long readBufferSize = READ_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteBufferSize() <em>Write Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteBufferSize() <em>Write Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBufferSize()
	 * @generated
	 * @ordered
	 */
	protected Long writeBufferSize = WRITE_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerCommunicationPort() <em>Server Communication Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCommunicationPort()
	 * @generated
	 * @ordered
	 */
	protected static final Long SERVER_COMMUNICATION_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerCommunicationPort() <em>Server Communication Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCommunicationPort()
	 * @generated
	 * @ordered
	 */
	protected Long serverCommunicationPort = SERVER_COMMUNICATION_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeCaching() <em>Attribute Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCaching()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ATTRIBUTE_CACHING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeCaching() <em>Attribute Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCaching()
	 * @generated
	 * @ordered
	 */
	protected Boolean attributeCaching = ATTRIBUTE_CACHING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeCachingForRegularFilesMin() <em>Attribute Caching For Regular Files Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForRegularFilesMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeCachingForRegularFilesMin() <em>Attribute Caching For Regular Files Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForRegularFilesMin()
	 * @generated
	 * @ordered
	 */
	protected Integer attributeCachingForRegularFilesMin = ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeCachingForRegularFilesMax() <em>Attribute Caching For Regular Files Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForRegularFilesMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeCachingForRegularFilesMax() <em>Attribute Caching For Regular Files Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForRegularFilesMax()
	 * @generated
	 * @ordered
	 */
	protected Integer attributeCachingForRegularFilesMax = ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeCachingForDirectoriesMin() <em>Attribute Caching For Directories Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForDirectoriesMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeCachingForDirectoriesMin() <em>Attribute Caching For Directories Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForDirectoriesMin()
	 * @generated
	 * @ordered
	 */
	protected Integer attributeCachingForDirectoriesMin = ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeCachingForDirectoriesMax() <em>Attribute Caching For Directories Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForDirectoriesMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeCachingForDirectoriesMax() <em>Attribute Caching For Directories Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCachingForDirectoriesMax()
	 * @generated
	 * @ordered
	 */
	protected Integer attributeCachingForDirectoriesMax = ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NFSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NFS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHardMount() {
		return hardMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardMount(Boolean newHardMount) {
		Boolean oldHardMount = hardMount;
		hardMount = newHardMount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__HARD_MOUNT, oldHardMount, hardMount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForegroundMount() {
		return foregroundMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForegroundMount(Boolean newForegroundMount) {
		Boolean oldForegroundMount = foregroundMount;
		foregroundMount = newForegroundMount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__FOREGROUND_MOUNT, oldForegroundMount, foregroundMount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInterrupt() {
		return interrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterrupt(Boolean newInterrupt) {
		Boolean oldInterrupt = interrupt;
		interrupt = newInterrupt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__INTERRUPT, oldInterrupt, interrupt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMountFailureRetries() {
		return mountFailureRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMountFailureRetries(Integer newMountFailureRetries) {
		Integer oldMountFailureRetries = mountFailureRetries;
		mountFailureRetries = newMountFailureRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__MOUNT_FAILURE_RETRIES, oldMountFailureRetries, mountFailureRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRetransmissionAttempts() {
		return retransmissionAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetransmissionAttempts(Integer newRetransmissionAttempts) {
		Integer oldRetransmissionAttempts = retransmissionAttempts;
		retransmissionAttempts = newRetransmissionAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__RETRANSMISSION_ATTEMPTS, oldRetransmissionAttempts, retransmissionAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRetransmissionTimeout() {
		return retransmissionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetransmissionTimeout(Long newRetransmissionTimeout) {
		Long oldRetransmissionTimeout = retransmissionTimeout;
		retransmissionTimeout = newRetransmissionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__RETRANSMISSION_TIMEOUT, oldRetransmissionTimeout, retransmissionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadBufferSize() {
		return readBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadBufferSize(Long newReadBufferSize) {
		Long oldReadBufferSize = readBufferSize;
		readBufferSize = newReadBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__READ_BUFFER_SIZE, oldReadBufferSize, readBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteBufferSize() {
		return writeBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteBufferSize(Long newWriteBufferSize) {
		Long oldWriteBufferSize = writeBufferSize;
		writeBufferSize = newWriteBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__WRITE_BUFFER_SIZE, oldWriteBufferSize, writeBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getServerCommunicationPort() {
		return serverCommunicationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerCommunicationPort(Long newServerCommunicationPort) {
		Long oldServerCommunicationPort = serverCommunicationPort;
		serverCommunicationPort = newServerCommunicationPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__SERVER_COMMUNICATION_PORT, oldServerCommunicationPort, serverCommunicationPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAttributeCaching() {
		return attributeCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeCaching(Boolean newAttributeCaching) {
		Boolean oldAttributeCaching = attributeCaching;
		attributeCaching = newAttributeCaching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__ATTRIBUTE_CACHING, oldAttributeCaching, attributeCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAttributeCachingForRegularFilesMin() {
		return attributeCachingForRegularFilesMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeCachingForRegularFilesMin(Integer newAttributeCachingForRegularFilesMin) {
		Integer oldAttributeCachingForRegularFilesMin = attributeCachingForRegularFilesMin;
		attributeCachingForRegularFilesMin = newAttributeCachingForRegularFilesMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN, oldAttributeCachingForRegularFilesMin, attributeCachingForRegularFilesMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAttributeCachingForRegularFilesMax() {
		return attributeCachingForRegularFilesMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeCachingForRegularFilesMax(Integer newAttributeCachingForRegularFilesMax) {
		Integer oldAttributeCachingForRegularFilesMax = attributeCachingForRegularFilesMax;
		attributeCachingForRegularFilesMax = newAttributeCachingForRegularFilesMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX, oldAttributeCachingForRegularFilesMax, attributeCachingForRegularFilesMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAttributeCachingForDirectoriesMin() {
		return attributeCachingForDirectoriesMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeCachingForDirectoriesMin(Integer newAttributeCachingForDirectoriesMin) {
		Integer oldAttributeCachingForDirectoriesMin = attributeCachingForDirectoriesMin;
		attributeCachingForDirectoriesMin = newAttributeCachingForDirectoriesMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN, oldAttributeCachingForDirectoriesMin, attributeCachingForDirectoriesMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAttributeCachingForDirectoriesMax() {
		return attributeCachingForDirectoriesMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeCachingForDirectoriesMax(Integer newAttributeCachingForDirectoriesMax) {
		Integer oldAttributeCachingForDirectoriesMax = attributeCachingForDirectoriesMax;
		attributeCachingForDirectoriesMax = newAttributeCachingForDirectoriesMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX, oldAttributeCachingForDirectoriesMax, attributeCachingForDirectoriesMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NFS__HARD_MOUNT:
				return getHardMount();
			case CimPackage.CIM_NFS__FOREGROUND_MOUNT:
				return getForegroundMount();
			case CimPackage.CIM_NFS__INTERRUPT:
				return getInterrupt();
			case CimPackage.CIM_NFS__MOUNT_FAILURE_RETRIES:
				return getMountFailureRetries();
			case CimPackage.CIM_NFS__RETRANSMISSION_ATTEMPTS:
				return getRetransmissionAttempts();
			case CimPackage.CIM_NFS__RETRANSMISSION_TIMEOUT:
				return getRetransmissionTimeout();
			case CimPackage.CIM_NFS__READ_BUFFER_SIZE:
				return getReadBufferSize();
			case CimPackage.CIM_NFS__WRITE_BUFFER_SIZE:
				return getWriteBufferSize();
			case CimPackage.CIM_NFS__SERVER_COMMUNICATION_PORT:
				return getServerCommunicationPort();
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING:
				return getAttributeCaching();
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN:
				return getAttributeCachingForRegularFilesMin();
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX:
				return getAttributeCachingForRegularFilesMax();
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN:
				return getAttributeCachingForDirectoriesMin();
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX:
				return getAttributeCachingForDirectoriesMax();
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
			case CimPackage.CIM_NFS__HARD_MOUNT:
				setHardMount((Boolean)newValue);
				return;
			case CimPackage.CIM_NFS__FOREGROUND_MOUNT:
				setForegroundMount((Boolean)newValue);
				return;
			case CimPackage.CIM_NFS__INTERRUPT:
				setInterrupt((Boolean)newValue);
				return;
			case CimPackage.CIM_NFS__MOUNT_FAILURE_RETRIES:
				setMountFailureRetries((Integer)newValue);
				return;
			case CimPackage.CIM_NFS__RETRANSMISSION_ATTEMPTS:
				setRetransmissionAttempts((Integer)newValue);
				return;
			case CimPackage.CIM_NFS__RETRANSMISSION_TIMEOUT:
				setRetransmissionTimeout((Long)newValue);
				return;
			case CimPackage.CIM_NFS__READ_BUFFER_SIZE:
				setReadBufferSize((Long)newValue);
				return;
			case CimPackage.CIM_NFS__WRITE_BUFFER_SIZE:
				setWriteBufferSize((Long)newValue);
				return;
			case CimPackage.CIM_NFS__SERVER_COMMUNICATION_PORT:
				setServerCommunicationPort((Long)newValue);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING:
				setAttributeCaching((Boolean)newValue);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN:
				setAttributeCachingForRegularFilesMin((Integer)newValue);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX:
				setAttributeCachingForRegularFilesMax((Integer)newValue);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN:
				setAttributeCachingForDirectoriesMin((Integer)newValue);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX:
				setAttributeCachingForDirectoriesMax((Integer)newValue);
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
			case CimPackage.CIM_NFS__HARD_MOUNT:
				setHardMount(HARD_MOUNT_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__FOREGROUND_MOUNT:
				setForegroundMount(FOREGROUND_MOUNT_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__INTERRUPT:
				setInterrupt(INTERRUPT_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__MOUNT_FAILURE_RETRIES:
				setMountFailureRetries(MOUNT_FAILURE_RETRIES_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__RETRANSMISSION_ATTEMPTS:
				setRetransmissionAttempts(RETRANSMISSION_ATTEMPTS_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__RETRANSMISSION_TIMEOUT:
				setRetransmissionTimeout(RETRANSMISSION_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__READ_BUFFER_SIZE:
				setReadBufferSize(READ_BUFFER_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__WRITE_BUFFER_SIZE:
				setWriteBufferSize(WRITE_BUFFER_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__SERVER_COMMUNICATION_PORT:
				setServerCommunicationPort(SERVER_COMMUNICATION_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING:
				setAttributeCaching(ATTRIBUTE_CACHING_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN:
				setAttributeCachingForRegularFilesMin(ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX:
				setAttributeCachingForRegularFilesMax(ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN:
				setAttributeCachingForDirectoriesMin(ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX:
				setAttributeCachingForDirectoriesMax(ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX_EDEFAULT);
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
			case CimPackage.CIM_NFS__HARD_MOUNT:
				return HARD_MOUNT_EDEFAULT == null ? hardMount != null : !HARD_MOUNT_EDEFAULT.equals(hardMount);
			case CimPackage.CIM_NFS__FOREGROUND_MOUNT:
				return FOREGROUND_MOUNT_EDEFAULT == null ? foregroundMount != null : !FOREGROUND_MOUNT_EDEFAULT.equals(foregroundMount);
			case CimPackage.CIM_NFS__INTERRUPT:
				return INTERRUPT_EDEFAULT == null ? interrupt != null : !INTERRUPT_EDEFAULT.equals(interrupt);
			case CimPackage.CIM_NFS__MOUNT_FAILURE_RETRIES:
				return MOUNT_FAILURE_RETRIES_EDEFAULT == null ? mountFailureRetries != null : !MOUNT_FAILURE_RETRIES_EDEFAULT.equals(mountFailureRetries);
			case CimPackage.CIM_NFS__RETRANSMISSION_ATTEMPTS:
				return RETRANSMISSION_ATTEMPTS_EDEFAULT == null ? retransmissionAttempts != null : !RETRANSMISSION_ATTEMPTS_EDEFAULT.equals(retransmissionAttempts);
			case CimPackage.CIM_NFS__RETRANSMISSION_TIMEOUT:
				return RETRANSMISSION_TIMEOUT_EDEFAULT == null ? retransmissionTimeout != null : !RETRANSMISSION_TIMEOUT_EDEFAULT.equals(retransmissionTimeout);
			case CimPackage.CIM_NFS__READ_BUFFER_SIZE:
				return READ_BUFFER_SIZE_EDEFAULT == null ? readBufferSize != null : !READ_BUFFER_SIZE_EDEFAULT.equals(readBufferSize);
			case CimPackage.CIM_NFS__WRITE_BUFFER_SIZE:
				return WRITE_BUFFER_SIZE_EDEFAULT == null ? writeBufferSize != null : !WRITE_BUFFER_SIZE_EDEFAULT.equals(writeBufferSize);
			case CimPackage.CIM_NFS__SERVER_COMMUNICATION_PORT:
				return SERVER_COMMUNICATION_PORT_EDEFAULT == null ? serverCommunicationPort != null : !SERVER_COMMUNICATION_PORT_EDEFAULT.equals(serverCommunicationPort);
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING:
				return ATTRIBUTE_CACHING_EDEFAULT == null ? attributeCaching != null : !ATTRIBUTE_CACHING_EDEFAULT.equals(attributeCaching);
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN:
				return ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN_EDEFAULT == null ? attributeCachingForRegularFilesMin != null : !ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MIN_EDEFAULT.equals(attributeCachingForRegularFilesMin);
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX:
				return ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX_EDEFAULT == null ? attributeCachingForRegularFilesMax != null : !ATTRIBUTE_CACHING_FOR_REGULAR_FILES_MAX_EDEFAULT.equals(attributeCachingForRegularFilesMax);
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN:
				return ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN_EDEFAULT == null ? attributeCachingForDirectoriesMin != null : !ATTRIBUTE_CACHING_FOR_DIRECTORIES_MIN_EDEFAULT.equals(attributeCachingForDirectoriesMin);
			case CimPackage.CIM_NFS__ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX:
				return ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX_EDEFAULT == null ? attributeCachingForDirectoriesMax != null : !ATTRIBUTE_CACHING_FOR_DIRECTORIES_MAX_EDEFAULT.equals(attributeCachingForDirectoriesMax);
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
		result.append(" (HardMount: ");
		result.append(hardMount);
		result.append(", ForegroundMount: ");
		result.append(foregroundMount);
		result.append(", Interrupt: ");
		result.append(interrupt);
		result.append(", MountFailureRetries: ");
		result.append(mountFailureRetries);
		result.append(", RetransmissionAttempts: ");
		result.append(retransmissionAttempts);
		result.append(", RetransmissionTimeout: ");
		result.append(retransmissionTimeout);
		result.append(", ReadBufferSize: ");
		result.append(readBufferSize);
		result.append(", WriteBufferSize: ");
		result.append(writeBufferSize);
		result.append(", ServerCommunicationPort: ");
		result.append(serverCommunicationPort);
		result.append(", AttributeCaching: ");
		result.append(attributeCaching);
		result.append(", AttributeCachingForRegularFilesMin: ");
		result.append(attributeCachingForRegularFilesMin);
		result.append(", AttributeCachingForRegularFilesMax: ");
		result.append(attributeCachingForRegularFilesMax);
		result.append(", AttributeCachingForDirectoriesMin: ");
		result.append(attributeCachingForDirectoriesMin);
		result.append(", AttributeCachingForDirectoriesMax: ");
		result.append(attributeCachingForDirectoriesMax);
		result.append(')');
		return result.toString();
	}

} //CIM_NFSImpl
