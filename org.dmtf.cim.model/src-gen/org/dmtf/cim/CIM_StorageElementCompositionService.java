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
 * A representation of the model object '<em><b>CIM Storage Element Composition Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Supplies the methods used to create and modify composite elements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageElementCompositionService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates (or modifies) a composite element. Note that only like elements can be combined.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element. If not NULL, this parameter will supply a new name when modifying an existing element.
	 * @param ElementType Enumeration indicating the type of element being created or modified. If the input parameter TheElement is specified when the operation is a 'modify', this type value must match the type of that instance.
	 * @param Job Reference to the job - may be null if job completed.
	 * @param Goal The QoS requirements for the composite element to maintain. If NULL, then the QoS setting associated to RepresentativeElement will be used for the QoS goal of the composite. If both Goal and RepresentativeElement are null, the instrumentation selects an appropriate Goal from the InElements.
	 * @param RepresentativeElement The instrumentation will use this parameter to determine the QoS goal of the composite. It will use this parameter + Size or InElements to determine the elements used to construct the composite. This parameter may be NULL. If both Goal and RepresentativeElement are null, the instrumentation selects an appropriate Goal from the InElements.
	 * @param Size As an input parameter Size specifies the desired size. If NULL, then InElements shall be supplied. If not NULL, this parameter will supply a new size when modifying an existing element. As an output parameter Size specifies the size achieved.
	 * @param InElements The elements from which to create the composite element. This parameter shall be NULL if Size is supplied. Once the elements are combined, they will be removed from the model and replaced with a single element. For some instrumentation, this may be one of the InElements, so in effect, all but one are removed.
	 * @param TheElement As an input parameter: if null, creates a new element. If not null, then the method modifies the specified element. As an output parameter, it is a reference to the resulting element.
	 * @param CompositeType Type of composite element to create. Possible values are Concatenate, Stripe, Concatenate+Stripe, Vendor specific.
	 * @param ElementSource Tell the instrumentation where to get the elements. Only applies when Size is specified and not InElements. Otherwise it shall be NULL. Possible values are: 1. Use existing elements only 2. Create new elements only 3. Can use existing or create new or both 4. Instrumentation decides If NULL, the instrumentation will decide.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"LogicalDisk\",\"DMTF Reserved\",\"Vendor Reserved\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" RepresentativeElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" SizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' PUnit='byte'" InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'" CompositeTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Concatenate elements\",\"Stripe elements\",\"Concatenate and stripe elements\",\"DMTF Reserved\",\"Vendor Reserved\"]'" ElementSourceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Use existing elements only\",\"Create new elements only\",\"Can use existing or create new or both\",\"Instrumentation decides\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long CreateOrModifyCompositeElement(String ElementName, Integer ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, CIM_StorageExtent RepresentativeElement, Long Size, EList<CIM_StorageExtent> InElements, CIM_LogicalElement TheElement, Integer CompositeType, Integer ElementSource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dissolves a composite into its constituent elements.
	 * @param Job Reference to the job - may be null if job completed.
	 * @param TheElement The composite element to dissolve. Possible element types are StorageVolume and LogicalDisk.
	 * @param OutElements The elements the extent was dissolved into.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'" OutElementsUnique="false" OutElementsMany="true"
	 *        OutElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ReturnElementToElements(CIM_ConcreteJob Job, CIM_LogicalElement TheElement, EList<CIM_StorageExtent> OutElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes one or more constituent elements from a composite volume. Note, removing a constituent element from a composite element may impact the data stored on the remaining constituent elements (see capabilities). Removing all constituent members is the same as invoking ReturnElementToElements.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheElement The composite element to affect. Possible element types are StorageVolume and LogicalDisk.
	 * @param InElements The elements to remove.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'" InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long RemoveElementsFromElement(CIM_ConcreteJob Job, CIM_LogicalElement TheElement, EList<CIM_LogicalElement> InElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method queries the set of pools passed in and returns a set of volumes or logical disks that can be composed together based on the specified goal and element passed in. Since there are usually complicated vendor-specific rules for creating these composite volumes, using the representative element can supply more vendor-specific information than would be in a interoperable setting. The client can then use some or all of this list in a call to CreateOrModifyCompositeElement().
	 * @param Job Reference to the job (may be null if job completed).
	 * @param InPools A list of pools to draw the candidate elements from.
	 * @param Goal The requirements for the element to maintain. This parameter should be a reference to a Setting or Profile appropriate to the element being created. .
	 * @param ElementType Enumeration indicating the type of element being created or modified.
	 * @param RepresentativeElement Serves as a guide to help the instrumentation determine which elements to return. It must be a member of one of the pools passed in. This may be NULL.
	 * @param Candidates The elements that can be used to create the composite element. These will be an array of references to StorageVolumes or LogicalDisks.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" InPoolsUnique="false" InPoolsMany="true"
	 *        InPoolsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF[]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"LogicalDisk\",\"DMTF Reserved\",\"Vendor Reserved\"]'" RepresentativeElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" CandidatesUnique="false" CandidatesMany="true"
	 *        CandidatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetAvailableElements(CIM_ConcreteJob Job, EList<CIM_StoragePool> InPools, CIM_StorageSetting Goal, Integer ElementType, CIM_StorageExtent RepresentativeElement, EList<CIM_StorageExtent> Candidates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the component elements of a composite element.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheElement The composite element to query.
	 * @param RequestType
	 *   Enumeration indicating the type of elements to return. 
	 *   Immediate: Immediate children of TheElement. 
	 *   Primordial: Dependent storage extents of TheElement at the lowest extent hierarchy.
	 * @param OutElements The elements that comprise the composite.
	 * @param OutElementTypes A parallel array to OutElements array containing: "Member of Stripe Set" or "Member of Concatenation".
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'" RequestTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Immediate\",\"Primordial\",\"DMTF Reserved\",\"Vendor Reserved\"]'" OutElementsUnique="false" OutElementsMany="true"
	 *        OutElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Out='true'" OutElementTypesUnique="false" OutElementTypesMany="true"
	 *        OutElementTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Member of Stripe Set\",\"Member of Concatenation\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetCompositeElements(CIM_ConcreteJob Job, CIM_LogicalElement TheElement, Integer RequestType, EList<CIM_StorageExtent> OutElements, EList<Integer> OutElementTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the list of possible stripe lengths which can be used in the property StorageSetting.ExtentStripeLength supplied, as the Goal, to the CreateOrModifyCompositeElement method. Note that different implementations may support either the GetSupportedStripeLengths or the GetSupportedStripeLengthRange method.
	 * @param ElementType Type of element.
	 * @param StripeLengths List of supported stripe lengths.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"LogicalDisk\",\"DMTF Reserved\",\"Vendor Reserved\"]'" StripeLengthsUnique="false" StripeLengthsMany="true"
	 *        StripeLengthsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' In='false' Out='true' PUnit='count'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Method Completed with no errors\",\"Method Not Supported\",\"ElementType not supported\",\"Use GetSupportedStripeLengthRange instead\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetSupportedStripeLengths(Integer ElementType, EList<Long> StripeLengths);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For systems that support a range of stripe lengths for composite volumes, this method can be used to retrieve the range of possible stripe lengths which can be used in the property StorageSetting.ExtentStripeLength supplied, as the Goal, to the CreateOrModifyCompositeElement method. Note that different implementations may support either the GetSupportedStripeLengths or the GetSupportedStripeLengthRange method. If the system only supports discrete values, then the return value will be set to 3.
	 * @param ElementType Type of element.
	 * @param MinimumStripeLength Minimum StripeLength for a composite element.
	 * @param MaximumStripeLength Maximum StripeLength for a composite element.
	 * @param StripeLengthDivisor Composite elements stripe length must be a multiple of this value.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"LogicalDisk\",\"DMTF Reserved\",\"Vendor Reserved\"]'" MinimumStripeLengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'" MaximumStripeLengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'" StripeLengthDivisorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Method Completed with no errors\",\"Method Not Supported\",\"ElementType not supported\",\"Use GetSupportedStripeLengths instead\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetSupportedStripeLengthRange(Integer ElementType, Long MinimumStripeLength, Long MaximumStripeLength, Long StripeLengthDivisor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the list of possible stripe depths (aka stripe size)to use in Goal parameter of the CreateOrModifyCompositeElement method for systems that support discrete stripe depths. Note that different implementations may support either the GetSupportedStripeDepths or the GetSupportedStripeDepthRange method.
	 * @param ElementType Type of element.
	 * @param StripeDepths List of supported stripe depths.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"LogicalDisk\",\"DMTF Reserved\",\"Vendor Reserved\"]'" StripeDepthsUnique="false" StripeDepthsMany="true"
	 *        StripeDepthsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' In='false' Out='true' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Method Completed with no errors\",\"Method Not Supported\",\"ElementType not supported\",\"Use GetSupportedStripeDepthRange instead\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetSupportedStripeDepths(Integer ElementType, EList<Long> StripeDepths);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the range of possible stripe depths (aka stripe size) to use in Goal parameter of the CreateOrModifyCompositeElement method. Note that different implementations may support either the GetSupportedStripeDepths or the GetSupportedStripeDepthRange method.
	 * @param ElementType Type of element.
	 * @param MinimumStripeDepth Minimum StripeDepth for a composite element.
	 * @param MaximumStripeDepth Maximum StripeDepth for a composite element.
	 * @param StripeDepthDivisor Composite elements stripe depth must be a multiple of this value.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"LogicalDisk\",\"DMTF Reserved\",\"Vendor Reserved\"]'" MinimumStripeDepthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true' PUnit='byte'" MaximumStripeDepthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true' PUnit='byte'" StripeDepthDivisorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Method Completed with no errors\",\"Method Not Supported\",\"ElementType not supported\",\"Use GetSupportedStripeDepths instead\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long GetSupportedStripeDepthRange(Integer ElementType, Long MinimumStripeDepth, Long MaximumStripeDepth, Long StripeDepthDivisor);

} // CIM_StorageElementCompositionService
