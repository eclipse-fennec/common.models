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
 * A representation of the model object '<em><b>CIM Launch In Context Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The LaunchInContext service provides the means for a client to manage information naming external services that are available to manage resources represented by instances in the containing CIM Namespace.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Core::LaunchInContext' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LaunchInContextService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is used to create a CIM_LaunchInContextSAP and related associations. When instantiated, a CIM_ServiceAffectsElement association with an ElementEffects entry = 5 shall be instantiated. Additionally, the required CIM_HostedServiceAccessPoint association shall be created to the CIM_System on which this service has a CIM_HostedService association. 
	 * If the RestrictedToElement array is NULL, then the instantiated CIM_LaunchInContextSAP applies to all instances of the classes named in the ManagedClasses array. Otherwise, the new instance applies to only those instances of CIM_ManagedElement that are explicitly referenced in the RestrictedToElement array.
	 * 0'Completed with No Error' shall be returned on success.
	 * 1'Not Supported' shall be returned if this method is not supported.
	 * 2'Unknown or Unspecified Error' is not expected
	 * 3'Atomicity Error' shall be returned if all of the specified restrictions can not be applied atomically. In that case, The Launch Point shall not be created and none of the added restrictions shall be applied and the recommended fall back is to apply them one by one.
	 * 4'Invalid Parameter' shall be returned if LaunchInfo does not contain a valid CIM_LaunchInContextSAP instance specification or if any RestrictedToElement entry is not a well-formed association.
	 * 5'In Use' shall be returned if an instance of CIM_LaunchInContextSAP having the same keys is already instantiated.6'Restriction Error' shall be returned if ManagementIsRestricted is false and the RestrictedToElement list is not empty or NULL.
	 * @param LaunchPointSpecification
	 *   An instance specification for a CIM_LaunchInContextSAP. 
	 *   Note: The SystemCreationClassName and SystemName property specifications shall be ignored and the instantiated instance shall use the corresponding values from the System associated to this service by CIM_HostedService.
	 * @param RestrictedToElement
	 *   If the specified launch point property, ManagementIsRestricted is false, then this property shall be NULL.
	 *   If Null, then the new instance of CIM_LaunchInContextSAP shall apply to all resources belonging to the system associated with this service or shall apply to no resources, depending on the value of ManagementIsRestricted. If not NULL, this property contains a list of references to instances of CIM_ManagedElement to which the new launch point is restricted. Such instances do not have to be related to the system of this service.
	 *   A well-formed reference that does not point to an instance of CIM_ManagedElement at the time of invocation shall be ignored.
	 *   On successful completion, a CIM_ManagementSAP association shall be instantiated between the new launch point and each element referenced in the RestrictedToElement list.
	 * @param LaunchPoint References the created instance of CIM_LaunchInContextSAP.
	 * <!-- end-model-doc -->
	 * @model LaunchPointSpecificationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' EmbeddedInstance='CIM_LaunchInContextSAP'" RestrictedToElementUnique="false" RestrictedToElementMany="true"
	 *        RestrictedToElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' In='true'" LaunchPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LaunchInContextSAP REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown or Unspecified Error\",\"Atomicity Error\",\"Invalid Parameter\",\"In Use\",\"Restriction Error\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateLaunchPoint(String LaunchPointSpecification, EList<CIM_ManagedElement> RestrictedToElement, CIM_LaunchInContextSAP LaunchPoint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is used to remove launch point information and related associations, including restrictions.
	 * If the RestrictedToElement array is NULL, then the removal is unconditional and additionally removes any related CIM_ManagementSAP associations as well. Otherwise, the CIM_ManagementSAP associations are removed and the instance of CIM_LaunchInContextSAP is removed only if no CIM_ManagementSAP associations remain.
	 * When an instance of CIM_LaunchInContextSAP is removed, related CIM_ServiceAffectsElement and CIM_HostedServiceAccessPoint associations are also removed.
	 * 0'Completed with No Error' is returned on success.
	 * 1'Not Supported' shall be returned if this method is not supported.
	 * 2'Unknown or Unspecified Error' is not expected
	 * 3'Atomicity Error' shall be returned if all of the specified restrictions can not be removed atomically. In that case, The Launch Point shall not be deleted and none of the existing restrictions shall be removed and the recommended fall back is to apply them one by one.
	 * 4'Invalid Parameter' shall be returned if LaunchPoint does not reference avalid CIM_LaunchInContextSAP instance specification or if any RestrictedToElement entry is not a well-formed association.
	 * 5'In Use' is not expected.
	 * 6'Restriction Error' shall be returned if ManagementIsRestricted is false and the RestrictedToElement list is not empty or NULL.
	 * @param LaunchPoint
	 *   Names an instance of CIM_LaunchInContextSAP representing a launch point that no longer applies.
	 *   On successful completions, if the RestrictedToElement array is null or empty, the referenced LaunchPoint instance shall be removed. Otherwise the referenced LaunchPoint instance shall not be removed unless the operation completes successfully and there are no remaining CIM_ManagementSAP associations to it.
	 * @param RestrictedToElement
	 *   Names specific instances of CIM_ManagedElement to which the related CIM_LaunchInContextSAP shall no longer apply.
	 *   On successful completion, All CIM_ManagementSAP associations between the named LaunchPoint and each named CIM_ManagedElement instance shall be removed.
	 * <!-- end-model-doc -->
	 * @model LaunchPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LaunchInContextSAP REF' Required='true' In='true'" RestrictedToElementUnique="false" RestrictedToElementMany="true"
	 *        RestrictedToElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown or Unspecified Error\",\"Atomicity Error\",\"Invalid Parameter\",\"In Use\",\"Restriction Error\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveLaunchPoint(CIM_LaunchInContextSAP LaunchPoint, EList<CIM_ManagedElement> RestrictedToElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply the referenced CIM_LaunchInContextSAP to additional instances of CIM_ManagedElement. These actions shall be applied atomically.
	 * 0'Completed with No Error' shall be returned on success.
	 * 1'Not Supported' is returned if this method is not supported.
	 * 2'Unknown or Unspecified Error' is not expected
	 * 3'Atomicity Error' shall be returned if all of the specified restrictions can not be applied atomically. In that case, no changes shall be made. The recommended fall back is to apply them one by one.
	 * 4'Invalid Parameter' shall be returned if LaunchPoint does not reference avalid CIM_LaunchInContextSAP instance specification or if any RestrictedToElement entry is not a well-formed association.
	 * 5'In Use' is not expected.
	 * 6'Restriction Error' shall be returned if the ManagementIsRestricted of the referenced launch point is false.
	 * @param LaunchPoint Names an instance of CIM_LaunchInContextSAP representing a launch point.
	 * @param RestrictedToElement
	 *   Names specific instances of CIM_ManagedElement to which the related CIM_LaunchInContextSAP shall apply.
	 *   On successful completion, A CIM_ManagementSAP association shall be instantiated for each referenced instance.
	 * <!-- end-model-doc -->
	 * @model LaunchPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LaunchInContextSAP REF' Required='true' In='true'" RestrictedToElementUnique="false" RestrictedToElementMany="true"
	 *        RestrictedToElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' Required='true' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown or Unspecified Error\",\"Atomicity Error\",\"Invalid Parameter\",\"In Use\",\"Restriction Error\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ApplyLaunchPoint(CIM_LaunchInContextSAP LaunchPoint, EList<CIM_ManagedElement> RestrictedToElement);

} // CIM_LaunchInContextService
