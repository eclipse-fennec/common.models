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
 * A representation of the model object '<em><b>CIM Database Segment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the attributes that affect the growth of a DatabaseSegment. The attributes are tied to the DatabaseSegment through an ElementSettingData association. 
 * This class can also be used to specify the default settings for all DatabaseSegment instances that are created within a CommonDatabase through an ElementSettingData association to the CommonDatabase. Processes that create new instances of DatabaseSegment and the associated setting data should check for a DatabaseSegmentSettingData instance that is associated with the CommonDatabase and should create a new instance of DatabaseSegmentSettingData that is specific to the DatabaseSegment only if the default settings need to be overridden or frozen for the specific DatabaseSegment instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getInitialExtentSize <em>Initial Extent Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getMinimumExtents <em>Minimum Extents</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getMaximumExtents <em>Maximum Extents</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getNextExtentSize <em>Next Extent Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getPercentIncrease <em>Percent Increase</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getNumberOfFreeLists <em>Number Of Free Lists</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Database::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseSegmentSettingData extends CIM_ScopedSettingData {
	/**
	 * Returns the value of the '<em><b>Initial Extent Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size, in bytes, of the first extent to be allocated when a database segment is created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Extent Size</em>' attribute.
	 * @see #setInitialExtentSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData_InitialExtentSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getInitialExtentSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getInitialExtentSize <em>Initial Extent Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Extent Size</em>' attribute.
	 * @see #getInitialExtentSize()
	 * @generated
	 */
	void setInitialExtentSize(Long value);

	/**
	 * Returns the value of the '<em><b>Minimum Extents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of extents to be allocated when the database segment is created. This setting allows for a large initial segment allocation at creation time, even if contiguous space is not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Extents</em>' attribute.
	 * @see #setMinimumExtents(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData_MinimumExtents()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true'"
	 * @generated
	 */
	Long getMinimumExtents();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getMinimumExtents <em>Minimum Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Extents</em>' attribute.
	 * @see #getMinimumExtents()
	 * @generated
	 */
	void setMinimumExtents(Long value);

	/**
	 * Returns the value of the '<em><b>Maximum Extents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper limit on the number of extents that can be allocated for the segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Extents</em>' attribute.
	 * @see #setMaximumExtents(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData_MaximumExtents()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true'"
	 * @generated
	 */
	Long getMaximumExtents();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getMaximumExtents <em>Maximum Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Extents</em>' attribute.
	 * @see #getMaximumExtents()
	 * @generated
	 */
	void setMaximumExtents(Long value);

	/**
	 * Returns the value of the '<em><b>Next Extent Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size, in bytes, to be allocated for the next incremental extent for the segment. A NextExtentSize of 0 indicates that the size of incremental extents will be determined based on the value of PercentIncrease.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Extent Size</em>' attribute.
	 * @see #setNextExtentSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData_NextExtentSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bytes' MinValue='0' ModelCorrespondence='[\"CIM_DatabaseSegmentSettingData.PercentIncrease\"]' PUnit='byte'"
	 * @generated
	 */
	Long getNextExtentSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getNextExtentSize <em>Next Extent Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Extent Size</em>' attribute.
	 * @see #getNextExtentSize()
	 * @generated
	 */
	void setNextExtentSize(Long value);

	/**
	 * Returns the value of the '<em><b>Percent Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage by which the next incremental extent will grow over the previously allocated size of all extents for the segment. A PercentIncrease of 0 indicates that all incremental extents will be the same size, as specified by NextExtentSize. This value is ignored and should be set to 0 if NextExtentSize has a value other than 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Increase</em>' attribute.
	 * @see #setPercentIncrease(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData_PercentIncrease()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' ModelCorrespondence='[\"CIM_DatabaseSegmentSettingData.NextExtentSize\"]'"
	 * @generated
	 */
	Integer getPercentIncrease();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getPercentIncrease <em>Percent Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Increase</em>' attribute.
	 * @see #getPercentIncrease()
	 * @generated
	 */
	void setPercentIncrease(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Free Lists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A freelist is a list of the free blocks that are associated with a database segment. The freelist is used to determine which segments are eligible for accepting data when a new insert or update request is processed. The NumberOfFreeLists setting identifies the number of freelists that are defined for the database segment. This value is typically set to the expected number of concurrent inserts for the segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Free Lists</em>' attribute.
	 * @see #setNumberOfFreeLists(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSegmentSettingData_NumberOfFreeLists()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true'"
	 * @generated
	 */
	Long getNumberOfFreeLists();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseSegmentSettingData#getNumberOfFreeLists <em>Number Of Free Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Free Lists</em>' attribute.
	 * @see #getNumberOfFreeLists()
	 * @generated
	 */
	void setNumberOfFreeLists(Long value);

} // CIM_DatabaseSegmentSettingData
