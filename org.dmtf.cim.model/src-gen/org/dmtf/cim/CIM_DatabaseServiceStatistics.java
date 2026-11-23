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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Database Service Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DatabaseServiceStatistics class contains the current statistics for a database service. These statistics are counters that are relative to the start of the service or from the time when a reset was issued.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getLastActivity <em>Last Activity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getActiveConnections <em>Active Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getCumulativeConnections <em>Cumulative Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRejectedConnections <em>Rejected Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getCompletedTransactions <em>Completed Transactions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getDiskReads <em>Disk Reads</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getDiskWrites <em>Disk Writes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getLogicalReads <em>Logical Reads</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getLogicalWrites <em>Logical Writes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getPageReads <em>Page Reads</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getPageWrites <em>Page Writes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getDiskSpaceUnavailable <em>Disk Space Unavailable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRequestsHandled <em>Requests Handled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRequestsReceived <em>Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRequestsSent <em>Requests Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getHighwaterConnections <em>Highwater Connections</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Database::Statistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseServiceStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Last Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the most recent inbound activity was observed for the database service. A value of all zeros indicates that no inbound activity has taken place since the service was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Activity</em>' attribute.
	 * @see #setLastActivity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_LastActivity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoLastInboundActivity\"]'"
	 * @generated
	 */
	String getLastActivity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getLastActivity <em>Last Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Activity</em>' attribute.
	 * @see #getLastActivity()
	 * @generated
	 */
	void setLastActivity(String value);

	/**
	 * Returns the value of the '<em><b>Active Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of active inbound connections that are currently using the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Connections</em>' attribute.
	 * @see #setActiveConnections(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_ActiveConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoapplInboundAssociation\"]'"
	 * @generated
	 */
	Long getActiveConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getActiveConnections <em>Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Connections</em>' attribute.
	 * @see #getActiveConnections()
	 * @generated
	 */
	void setActiveConnections(Long value);

	/**
	 * Returns the value of the '<em><b>Cumulative Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of inbound connections to the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cumulative Connections</em>' attribute.
	 * @see #setCumulativeConnections(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_CumulativeConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoapplAccumulatedInboundAssociations\"]'"
	 * @generated
	 */
	Long getCumulativeConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getCumulativeConnections <em>Cumulative Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulative Connections</em>' attribute.
	 * @see #getCumulativeConnections()
	 * @generated
	 */
	void setCumulativeConnections(Long value);

	/**
	 * Returns the value of the '<em><b>Rejected Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of inbound connections that were rejected by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rejected Connections</em>' attribute.
	 * @see #setRejectedConnections(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_RejectedConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoapplRejectedInboundAssociations\"]'"
	 * @generated
	 */
	Long getRejectedConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRejectedConnections <em>Rejected Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Connections</em>' attribute.
	 * @see #getRejectedConnections()
	 * @generated
	 */
	void setRejectedConnections(Long value);

	/**
	 * Returns the value of the '<em><b>Completed Transactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of transactions that have been completed by a commit or abort. Some database operations, such as read-only queries, might not create a transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completed Transactions</em>' attribute.
	 * @see #setCompletedTransactions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_CompletedTransactions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoFinishedTransactions\"]'"
	 * @generated
	 */
	Long getCompletedTransactions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getCompletedTransactions <em>Completed Transactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Transactions</em>' attribute.
	 * @see #getCompletedTransactions()
	 * @generated
	 */
	void setCompletedTransactions(Long value);

	/**
	 * Returns the value of the '<em><b>Disk Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of database file reads that were issued by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Reads</em>' attribute.
	 * @see #setDiskReads(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_DiskReads()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoDiskReads\"]'"
	 * @generated
	 */
	Long getDiskReads();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getDiskReads <em>Disk Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Reads</em>' attribute.
	 * @see #getDiskReads()
	 * @generated
	 */
	void setDiskReads(Long value);

	/**
	 * Returns the value of the '<em><b>Disk Writes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of database file writes that were issued by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Writes</em>' attribute.
	 * @see #setDiskWrites(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_DiskWrites()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoDiskWrites\"]'"
	 * @generated
	 */
	Long getDiskWrites();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getDiskWrites <em>Disk Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Writes</em>' attribute.
	 * @see #getDiskWrites()
	 * @generated
	 */
	void setDiskWrites(Long value);

	/**
	 * Returns the value of the '<em><b>Logical Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of logical database file reads that were issued by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Reads</em>' attribute.
	 * @see #setLogicalReads(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_LogicalReads()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoLogicalReads\"]'"
	 * @generated
	 */
	Long getLogicalReads();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getLogicalReads <em>Logical Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Reads</em>' attribute.
	 * @see #getLogicalReads()
	 * @generated
	 */
	void setLogicalReads(Long value);

	/**
	 * Returns the value of the '<em><b>Logical Writes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of logical database file writes that were issued by the service since it was started. A logical write is a count of the number of times that parts of database files have been marked dirty to indicate that they need to be written to disk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Writes</em>' attribute.
	 * @see #setLogicalWrites(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_LogicalWrites()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoLogicalWrites\"]'"
	 * @generated
	 */
	Long getLogicalWrites();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getLogicalWrites <em>Logical Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Writes</em>' attribute.
	 * @see #getLogicalWrites()
	 * @generated
	 */
	void setLogicalWrites(Long value);

	/**
	 * Returns the value of the '<em><b>Page Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of database pages that have been read by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Reads</em>' attribute.
	 * @see #setPageReads(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_PageReads()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoPageReads\"]'"
	 * @generated
	 */
	Long getPageReads();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getPageReads <em>Page Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Reads</em>' attribute.
	 * @see #getPageReads()
	 * @generated
	 */
	void setPageReads(Long value);

	/**
	 * Returns the value of the '<em><b>Page Writes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of database pages that have been written by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Writes</em>' attribute.
	 * @see #setPageWrites(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_PageWrites()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoPageWrites\"]'"
	 * @generated
	 */
	Long getPageWrites();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getPageWrites <em>Page Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Writes</em>' attribute.
	 * @see #getPageWrites()
	 * @generated
	 */
	void setPageWrites(Long value);

	/**
	 * Returns the value of the '<em><b>Disk Space Unavailable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of times that the database requested disk space and it was not available since the service was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Space Unavailable</em>' attribute.
	 * @see #setDiskSpaceUnavailable(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_DiskSpaceUnavailable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoDiskOutOfSpaces\"]'"
	 * @generated
	 */
	Long getDiskSpaceUnavailable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getDiskSpaceUnavailable <em>Disk Space Unavailable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Space Unavailable</em>' attribute.
	 * @see #getDiskSpaceUnavailable()
	 * @generated
	 */
	void setDiskSpaceUnavailable(Long value);

	/**
	 * Returns the value of the '<em><b>Requests Handled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of requests that have been received by the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requests Handled</em>' attribute.
	 * @see #setRequestsHandled(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_RequestsHandled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoHandledRequests\"]'"
	 * @generated
	 */
	Long getRequestsHandled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRequestsHandled <em>Requests Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests Handled</em>' attribute.
	 * @see #getRequestsHandled()
	 * @generated
	 */
	void setRequestsHandled(Long value);

	/**
	 * Returns the value of the '<em><b>Requests Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of receive operations made by the service during request processing since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requests Received</em>' attribute.
	 * @see #setRequestsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_RequestsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoRequestRecvs\"]'"
	 * @generated
	 */
	Long getRequestsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRequestsReceived <em>Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests Received</em>' attribute.
	 * @see #getRequestsReceived()
	 * @generated
	 */
	void setRequestsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Requests Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of send operations made by the service during request processing since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requests Sent</em>' attribute.
	 * @see #setRequestsSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_RequestsSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoRequestsSent\"]'"
	 * @generated
	 */
	Long getRequestsSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getRequestsSent <em>Requests Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests Sent</em>' attribute.
	 * @see #getRequestsSent()
	 * @generated
	 */
	void setRequestsSent(Long value);

	/**
	 * Returns the value of the '<em><b>Highwater Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of active inbound connections that have been concurrently using the service since it was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highwater Connections</em>' attribute.
	 * @see #setHighwaterConnections(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseServiceStatistics_HighwaterConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoHighwaterInboundAssociations\"]'"
	 * @generated
	 */
	Long getHighwaterConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseServiceStatistics#getHighwaterConnections <em>Highwater Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highwater Connections</em>' attribute.
	 * @see #getHighwaterConnections()
	 * @generated
	 */
	void setHighwaterConnections(Long value);

} // CIM_DatabaseServiceStatistics
