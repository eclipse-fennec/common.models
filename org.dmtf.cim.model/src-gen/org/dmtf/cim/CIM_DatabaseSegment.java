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
 * A representation of the model object '<em><b>CIM Database Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A database segment is a logical storage entity that is composed of one or more storage extents, each of which can have one or more database blocks. Database segments have various types depending on their purpose. Note that the order of extents within a DatabaseSegment should be represented in the BasedOn dependency of CIM_StorageExtent using the BasedOn.OrderIndex attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegment#getOtherPurpose <em>Other Purpose</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegment()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Database::Storage' override.Purpose='string' override.Purpose.Description='The purpose of this segment within the context of the database. A value of \"Data\" indicates that this segment contains data for database area. A value of \"Data Partition\" indicates that this segment contains a portion of a partitioned data area. A value of \"Data Cluster\" indicates that this segment contains a portion of a clustered database area. A value of \"Index\" indicates that this segment contains index information. A value of \"Index Partition\" indicates that this segment contains a portion of a partitioned index. A value of \"LOB\" indicates that this segment is used to hold large objects such as Binary Large Object (BLOB) or Character Large Object (CLOB) entities. A value of \"LOB Index\" indicates that this segment is used to hold index information relevant to a \"LOB\" segment. A value of \"Undo\" indicates that this segment contains undo or rollback information that might be used to reverse operations that are applied to a database. A value of \"Snapshot\" indicates that this segment is used to represent a portion of the database at a previous point-in-time. A value of \"Temp\" indicates that this segment is used as temporary space for database operations. A value of \"Other\" indicates that the segment is used for something other than any of the listed purposes and requires further description in the OtherPurpose attribute. Using a value of \"Other\" would generally indicate a need to extend the model to include an additional purpose.' override.Purpose.ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' override.Purpose.Values='[\"Other\",\"Data\",\"Data Partition\",\"Data Cluster\",\"Index\",\"Index Partition\",\"LOB\",\"LOB Index\",\"Undo\",\"Snapshot\",\"Temp\"]' override.Purpose.ModelCorrespondence='[\"CIM_DatabaseSegment.OtherPurpose\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseSegment extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Other Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this segment when the Purpose attribute has a value of "Other". This attribute should be null in all other cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Purpose</em>' attribute.
	 * @see #setOtherPurpose(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegment_OtherPurpose()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DatabaseSegment.Purpose\"]'"
	 * @generated
	 */
	String getOtherPurpose();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegment#getOtherPurpose <em>Other Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Purpose</em>' attribute.
	 * @see #getOtherPurpose()
	 * @generated
	 */
	void setOtherPurpose(String value);

} // CIM_DatabaseSegment
