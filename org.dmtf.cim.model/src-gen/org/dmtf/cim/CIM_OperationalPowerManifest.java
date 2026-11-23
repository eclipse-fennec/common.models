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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Operational Power Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this class define a list of supported or desired properties of OperationalPowerStatisticalData instances. In the case where a OperationalPowerManafest instance is a member of a OperationalPowerManafestCollection used in a OperationalPowerStatisticsService.GetStatisticsCollection request, for each of the boolean "include" properties set to true in that OperationalPowerManafest, the corresponding OperationalPowerStatisticalData property will be included, if available, in the statistics returned for OperationalPowerStatisticalData instances whose ElementType matches the ElementType of the OperationalPowerManafest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerManifest#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerManifest#getIncludeStatisticTime <em>Include Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerManifest#getIncludeMilliwatts <em>Include Milliwatts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerManifest#getIncludePrecision <em>Include Precision</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperationalPowerManifest#getCSVSequence <em>CSV Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Power' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n: \nWhere and are separated by a colon (:), and where must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the _ structure of Schema class names.) In addition, to ensure uniqueness, must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between and . is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm must be used with the set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OperationalPowerManifest extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the type of elements that this OperationalPowerManifest can be applied to (e.g. during a GetStatisticsCollection request). This is used when the same set of statistical metrics is calculated for several types of devices. In this way, a single OperationalPowerManafest instance can be used to filter all the StatsiticalData instances that contain metrics for the same type of element in a StatisticsCollection. If used, a subclass should override this property to specify the element types supported by that class, preferably through ValueMap and Values qualifiers to allow clients to programmatically retrieve those supported types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifest_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"10\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"..\",\"0x8000..\"]' Values='[\"Computer System\",\"Disk Drive\",\"PDU\",\"Power Supply\",\"Fan\",\"CPU\",\"RAID Group\",\"Disk Tray\",\"Controller\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_OperationalPowerStatisticalData.ElementType\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerManifest#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Include Statistic Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time when statistics for this OperationalPowerManafest were last captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Statistic Time</em>' attribute.
	 * @see #setIncludeStatisticTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifest_IncludeStatisticTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_OperationalPowerStatisticalData.StatisticTime\"]'"
	 * @generated
	 */
	Boolean getIncludeStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerManifest#getIncludeStatisticTime <em>Include Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Statistic Time</em>' attribute.
	 * @see #getIncludeStatisticTime()
	 * @generated
	 */
	void setIncludeStatisticTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Milliwatts</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the Milliwatts for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Milliwatts</em>' attribute.
	 * @see #setIncludeMilliwatts(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifest_IncludeMilliwatts()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_OperationalPowerStatisticalData.StatisticTime\"]'"
	 * @generated
	 */
	Boolean getIncludeMilliwatts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerManifest#getIncludeMilliwatts <em>Include Milliwatts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Milliwatts</em>' attribute.
	 * @see #getIncludeMilliwatts()
	 * @generated
	 */
	void setIncludeMilliwatts(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Precision</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the precision of the Milliwatts attribute for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Precision</em>' attribute.
	 * @see #setIncludePrecision(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifest_IncludePrecision()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_OperationalPowerStatisticalData.Milliwatts\"]'"
	 * @generated
	 */
	Boolean getIncludePrecision();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperationalPowerManifest#getIncludePrecision <em>Include Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Precision</em>' attribute.
	 * @see #getIncludePrecision()
	 * @generated
	 */
	void setIncludePrecision(Boolean value);

	/**
	 * Returns the value of the '<em><b>CSV Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence of OperationalPowerStatisticalData property names for properties that will be returned are encoded in the CSVSequence array. Properties that are not included will not be returned with GetStatisticsCollection. Properties that are included in CSVSequence will be returned in the order they appear in CSVSequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CSV Sequence</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OperationalPowerManifest_CSVSequence()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCSVSequence();

} // CIM_OperationalPowerManifest
