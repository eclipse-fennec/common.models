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

import org.dmtf.cim.CIM_DatabaseServiceStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Database Service Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getLastActivity <em>Last Activity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getActiveConnections <em>Active Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getCumulativeConnections <em>Cumulative Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getRejectedConnections <em>Rejected Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getCompletedTransactions <em>Completed Transactions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getDiskReads <em>Disk Reads</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getDiskWrites <em>Disk Writes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getLogicalReads <em>Logical Reads</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getLogicalWrites <em>Logical Writes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getPageReads <em>Page Reads</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getPageWrites <em>Page Writes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getDiskSpaceUnavailable <em>Disk Space Unavailable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getRequestsHandled <em>Requests Handled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getRequestsReceived <em>Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getRequestsSent <em>Requests Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceStatisticsImpl#getHighwaterConnections <em>Highwater Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DatabaseServiceStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_DatabaseServiceStatistics {
	/**
	 * The default value of the '{@link #getLastActivity() <em>Last Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActivity()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_ACTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastActivity() <em>Last Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActivity()
	 * @generated
	 * @ordered
	 */
	protected String lastActivity = LAST_ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveConnections() <em>Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Long ACTIVE_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveConnections() <em>Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveConnections()
	 * @generated
	 * @ordered
	 */
	protected Long activeConnections = ACTIVE_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCumulativeConnections() <em>Cumulative Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulativeConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Long CUMULATIVE_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCumulativeConnections() <em>Cumulative Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulativeConnections()
	 * @generated
	 * @ordered
	 */
	protected Long cumulativeConnections = CUMULATIVE_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectedConnections() <em>Rejected Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Long REJECTED_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectedConnections() <em>Rejected Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedConnections()
	 * @generated
	 * @ordered
	 */
	protected Long rejectedConnections = REJECTED_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletedTransactions() <em>Completed Transactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedTransactions()
	 * @generated
	 * @ordered
	 */
	protected static final Long COMPLETED_TRANSACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletedTransactions() <em>Completed Transactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedTransactions()
	 * @generated
	 * @ordered
	 */
	protected Long completedTransactions = COMPLETED_TRANSACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskReads() <em>Disk Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskReads()
	 * @generated
	 * @ordered
	 */
	protected static final Long DISK_READS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskReads() <em>Disk Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskReads()
	 * @generated
	 * @ordered
	 */
	protected Long diskReads = DISK_READS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskWrites() <em>Disk Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskWrites()
	 * @generated
	 * @ordered
	 */
	protected static final Long DISK_WRITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskWrites() <em>Disk Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskWrites()
	 * @generated
	 * @ordered
	 */
	protected Long diskWrites = DISK_WRITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalReads() <em>Logical Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalReads()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOGICAL_READS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalReads() <em>Logical Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalReads()
	 * @generated
	 * @ordered
	 */
	protected Long logicalReads = LOGICAL_READS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalWrites() <em>Logical Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalWrites()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOGICAL_WRITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalWrites() <em>Logical Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalWrites()
	 * @generated
	 * @ordered
	 */
	protected Long logicalWrites = LOGICAL_WRITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageReads() <em>Page Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageReads()
	 * @generated
	 * @ordered
	 */
	protected static final Long PAGE_READS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageReads() <em>Page Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageReads()
	 * @generated
	 * @ordered
	 */
	protected Long pageReads = PAGE_READS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageWrites() <em>Page Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWrites()
	 * @generated
	 * @ordered
	 */
	protected static final Long PAGE_WRITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageWrites() <em>Page Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWrites()
	 * @generated
	 * @ordered
	 */
	protected Long pageWrites = PAGE_WRITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSpaceUnavailable() <em>Disk Space Unavailable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpaceUnavailable()
	 * @generated
	 * @ordered
	 */
	protected static final Long DISK_SPACE_UNAVAILABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskSpaceUnavailable() <em>Disk Space Unavailable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpaceUnavailable()
	 * @generated
	 * @ordered
	 */
	protected Long diskSpaceUnavailable = DISK_SPACE_UNAVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestsHandled() <em>Requests Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsHandled()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTS_HANDLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestsHandled() <em>Requests Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsHandled()
	 * @generated
	 * @ordered
	 */
	protected Long requestsHandled = REQUESTS_HANDLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestsReceived() <em>Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestsReceived() <em>Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long requestsReceived = REQUESTS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestsSent() <em>Requests Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestsSent() <em>Requests Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsSent()
	 * @generated
	 * @ordered
	 */
	protected Long requestsSent = REQUESTS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighwaterConnections() <em>Highwater Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwaterConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Long HIGHWATER_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighwaterConnections() <em>Highwater Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwaterConnections()
	 * @generated
	 * @ordered
	 */
	protected Long highwaterConnections = HIGHWATER_CONNECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DatabaseServiceStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DatabaseServiceStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastActivity() {
		return lastActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastActivity(String newLastActivity) {
		String oldLastActivity = lastActivity;
		lastActivity = newLastActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LAST_ACTIVITY, oldLastActivity, lastActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getActiveConnections() {
		return activeConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveConnections(Long newActiveConnections) {
		Long oldActiveConnections = activeConnections;
		activeConnections = newActiveConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__ACTIVE_CONNECTIONS, oldActiveConnections, activeConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCumulativeConnections() {
		return cumulativeConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCumulativeConnections(Long newCumulativeConnections) {
		Long oldCumulativeConnections = cumulativeConnections;
		cumulativeConnections = newCumulativeConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__CUMULATIVE_CONNECTIONS, oldCumulativeConnections, cumulativeConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRejectedConnections() {
		return rejectedConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRejectedConnections(Long newRejectedConnections) {
		Long oldRejectedConnections = rejectedConnections;
		rejectedConnections = newRejectedConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REJECTED_CONNECTIONS, oldRejectedConnections, rejectedConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCompletedTransactions() {
		return completedTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletedTransactions(Long newCompletedTransactions) {
		Long oldCompletedTransactions = completedTransactions;
		completedTransactions = newCompletedTransactions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__COMPLETED_TRANSACTIONS, oldCompletedTransactions, completedTransactions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDiskReads() {
		return diskReads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskReads(Long newDiskReads) {
		Long oldDiskReads = diskReads;
		diskReads = newDiskReads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_READS, oldDiskReads, diskReads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDiskWrites() {
		return diskWrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskWrites(Long newDiskWrites) {
		Long oldDiskWrites = diskWrites;
		diskWrites = newDiskWrites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_WRITES, oldDiskWrites, diskWrites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLogicalReads() {
		return logicalReads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalReads(Long newLogicalReads) {
		Long oldLogicalReads = logicalReads;
		logicalReads = newLogicalReads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_READS, oldLogicalReads, logicalReads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLogicalWrites() {
		return logicalWrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalWrites(Long newLogicalWrites) {
		Long oldLogicalWrites = logicalWrites;
		logicalWrites = newLogicalWrites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_WRITES, oldLogicalWrites, logicalWrites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPageReads() {
		return pageReads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageReads(Long newPageReads) {
		Long oldPageReads = pageReads;
		pageReads = newPageReads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_READS, oldPageReads, pageReads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPageWrites() {
		return pageWrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageWrites(Long newPageWrites) {
		Long oldPageWrites = pageWrites;
		pageWrites = newPageWrites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_WRITES, oldPageWrites, pageWrites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDiskSpaceUnavailable() {
		return diskSpaceUnavailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskSpaceUnavailable(Long newDiskSpaceUnavailable) {
		Long oldDiskSpaceUnavailable = diskSpaceUnavailable;
		diskSpaceUnavailable = newDiskSpaceUnavailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_SPACE_UNAVAILABLE, oldDiskSpaceUnavailable, diskSpaceUnavailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestsHandled() {
		return requestsHandled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestsHandled(Long newRequestsHandled) {
		Long oldRequestsHandled = requestsHandled;
		requestsHandled = newRequestsHandled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_HANDLED, oldRequestsHandled, requestsHandled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestsReceived() {
		return requestsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestsReceived(Long newRequestsReceived) {
		Long oldRequestsReceived = requestsReceived;
		requestsReceived = newRequestsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_RECEIVED, oldRequestsReceived, requestsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestsSent() {
		return requestsSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestsSent(Long newRequestsSent) {
		Long oldRequestsSent = requestsSent;
		requestsSent = newRequestsSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_SENT, oldRequestsSent, requestsSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHighwaterConnections() {
		return highwaterConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighwaterConnections(Long newHighwaterConnections) {
		Long oldHighwaterConnections = highwaterConnections;
		highwaterConnections = newHighwaterConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE_STATISTICS__HIGHWATER_CONNECTIONS, oldHighwaterConnections, highwaterConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LAST_ACTIVITY:
				return getLastActivity();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__ACTIVE_CONNECTIONS:
				return getActiveConnections();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__CUMULATIVE_CONNECTIONS:
				return getCumulativeConnections();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REJECTED_CONNECTIONS:
				return getRejectedConnections();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__COMPLETED_TRANSACTIONS:
				return getCompletedTransactions();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_READS:
				return getDiskReads();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_WRITES:
				return getDiskWrites();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_READS:
				return getLogicalReads();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_WRITES:
				return getLogicalWrites();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_READS:
				return getPageReads();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_WRITES:
				return getPageWrites();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_SPACE_UNAVAILABLE:
				return getDiskSpaceUnavailable();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_HANDLED:
				return getRequestsHandled();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_RECEIVED:
				return getRequestsReceived();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_SENT:
				return getRequestsSent();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__HIGHWATER_CONNECTIONS:
				return getHighwaterConnections();
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
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LAST_ACTIVITY:
				setLastActivity((String)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__ACTIVE_CONNECTIONS:
				setActiveConnections((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__CUMULATIVE_CONNECTIONS:
				setCumulativeConnections((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REJECTED_CONNECTIONS:
				setRejectedConnections((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__COMPLETED_TRANSACTIONS:
				setCompletedTransactions((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_READS:
				setDiskReads((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_WRITES:
				setDiskWrites((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_READS:
				setLogicalReads((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_WRITES:
				setLogicalWrites((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_READS:
				setPageReads((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_WRITES:
				setPageWrites((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_SPACE_UNAVAILABLE:
				setDiskSpaceUnavailable((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_HANDLED:
				setRequestsHandled((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_RECEIVED:
				setRequestsReceived((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_SENT:
				setRequestsSent((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__HIGHWATER_CONNECTIONS:
				setHighwaterConnections((Long)newValue);
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
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LAST_ACTIVITY:
				setLastActivity(LAST_ACTIVITY_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__ACTIVE_CONNECTIONS:
				setActiveConnections(ACTIVE_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__CUMULATIVE_CONNECTIONS:
				setCumulativeConnections(CUMULATIVE_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REJECTED_CONNECTIONS:
				setRejectedConnections(REJECTED_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__COMPLETED_TRANSACTIONS:
				setCompletedTransactions(COMPLETED_TRANSACTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_READS:
				setDiskReads(DISK_READS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_WRITES:
				setDiskWrites(DISK_WRITES_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_READS:
				setLogicalReads(LOGICAL_READS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_WRITES:
				setLogicalWrites(LOGICAL_WRITES_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_READS:
				setPageReads(PAGE_READS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_WRITES:
				setPageWrites(PAGE_WRITES_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_SPACE_UNAVAILABLE:
				setDiskSpaceUnavailable(DISK_SPACE_UNAVAILABLE_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_HANDLED:
				setRequestsHandled(REQUESTS_HANDLED_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_RECEIVED:
				setRequestsReceived(REQUESTS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_SENT:
				setRequestsSent(REQUESTS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__HIGHWATER_CONNECTIONS:
				setHighwaterConnections(HIGHWATER_CONNECTIONS_EDEFAULT);
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
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LAST_ACTIVITY:
				return LAST_ACTIVITY_EDEFAULT == null ? lastActivity != null : !LAST_ACTIVITY_EDEFAULT.equals(lastActivity);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__ACTIVE_CONNECTIONS:
				return ACTIVE_CONNECTIONS_EDEFAULT == null ? activeConnections != null : !ACTIVE_CONNECTIONS_EDEFAULT.equals(activeConnections);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__CUMULATIVE_CONNECTIONS:
				return CUMULATIVE_CONNECTIONS_EDEFAULT == null ? cumulativeConnections != null : !CUMULATIVE_CONNECTIONS_EDEFAULT.equals(cumulativeConnections);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REJECTED_CONNECTIONS:
				return REJECTED_CONNECTIONS_EDEFAULT == null ? rejectedConnections != null : !REJECTED_CONNECTIONS_EDEFAULT.equals(rejectedConnections);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__COMPLETED_TRANSACTIONS:
				return COMPLETED_TRANSACTIONS_EDEFAULT == null ? completedTransactions != null : !COMPLETED_TRANSACTIONS_EDEFAULT.equals(completedTransactions);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_READS:
				return DISK_READS_EDEFAULT == null ? diskReads != null : !DISK_READS_EDEFAULT.equals(diskReads);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_WRITES:
				return DISK_WRITES_EDEFAULT == null ? diskWrites != null : !DISK_WRITES_EDEFAULT.equals(diskWrites);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_READS:
				return LOGICAL_READS_EDEFAULT == null ? logicalReads != null : !LOGICAL_READS_EDEFAULT.equals(logicalReads);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__LOGICAL_WRITES:
				return LOGICAL_WRITES_EDEFAULT == null ? logicalWrites != null : !LOGICAL_WRITES_EDEFAULT.equals(logicalWrites);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_READS:
				return PAGE_READS_EDEFAULT == null ? pageReads != null : !PAGE_READS_EDEFAULT.equals(pageReads);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__PAGE_WRITES:
				return PAGE_WRITES_EDEFAULT == null ? pageWrites != null : !PAGE_WRITES_EDEFAULT.equals(pageWrites);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__DISK_SPACE_UNAVAILABLE:
				return DISK_SPACE_UNAVAILABLE_EDEFAULT == null ? diskSpaceUnavailable != null : !DISK_SPACE_UNAVAILABLE_EDEFAULT.equals(diskSpaceUnavailable);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_HANDLED:
				return REQUESTS_HANDLED_EDEFAULT == null ? requestsHandled != null : !REQUESTS_HANDLED_EDEFAULT.equals(requestsHandled);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_RECEIVED:
				return REQUESTS_RECEIVED_EDEFAULT == null ? requestsReceived != null : !REQUESTS_RECEIVED_EDEFAULT.equals(requestsReceived);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__REQUESTS_SENT:
				return REQUESTS_SENT_EDEFAULT == null ? requestsSent != null : !REQUESTS_SENT_EDEFAULT.equals(requestsSent);
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS__HIGHWATER_CONNECTIONS:
				return HIGHWATER_CONNECTIONS_EDEFAULT == null ? highwaterConnections != null : !HIGHWATER_CONNECTIONS_EDEFAULT.equals(highwaterConnections);
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
		result.append(" (LastActivity: ");
		result.append(lastActivity);
		result.append(", ActiveConnections: ");
		result.append(activeConnections);
		result.append(", CumulativeConnections: ");
		result.append(cumulativeConnections);
		result.append(", RejectedConnections: ");
		result.append(rejectedConnections);
		result.append(", CompletedTransactions: ");
		result.append(completedTransactions);
		result.append(", DiskReads: ");
		result.append(diskReads);
		result.append(", DiskWrites: ");
		result.append(diskWrites);
		result.append(", LogicalReads: ");
		result.append(logicalReads);
		result.append(", LogicalWrites: ");
		result.append(logicalWrites);
		result.append(", PageReads: ");
		result.append(pageReads);
		result.append(", PageWrites: ");
		result.append(pageWrites);
		result.append(", DiskSpaceUnavailable: ");
		result.append(diskSpaceUnavailable);
		result.append(", RequestsHandled: ");
		result.append(requestsHandled);
		result.append(", RequestsReceived: ");
		result.append(requestsReceived);
		result.append(", RequestsSent: ");
		result.append(requestsSent);
		result.append(", HighwaterConnections: ");
		result.append(highwaterConnections);
		result.append(')');
		return result.toString();
	}

} //CIM_DatabaseServiceStatisticsImpl
