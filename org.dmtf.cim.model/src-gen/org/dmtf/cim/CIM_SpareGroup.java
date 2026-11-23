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
 * A representation of the model object '<em><b>CIM Spare Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from RedundancyGroup indicating that one or more of the aggregated elements can be spared. (The actual Spares are defined using the ActsAsSpare association.) An example is the use of redundant NICs in a ComputerSystem - where one NIC is primary and the other is Spare. The 'primary' NIC would be a member of the SpareGroup (associated using the RedundancyComponent class) and the 'other' NIC would be associated using the ActsAsSpare relationship. 
 * The use of the class is being deprecated in lieu of using the RedundancySet class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SpareGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_RedundancySet\"]' Version='2.13.0' UMLPackagePath='CIM::Core::Redundancy' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SpareGroup extends CIM_RedundancyGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is forces a failover from one ManagedSystem Element to another. There are two parameters to the Failover method, FailoverFrom and FailoverTo. The FailoverFrom parameter is a reference to the primary ManagedSystemElement that will become inactive after the method. This Element should be associated with the SpareGroup through the RedundancyComponent relationship. The FailoverTo parameter is a reference to the ManagedSystemElement that will take over for the primary. This Element should be associated with the SpareGroup through the ActsAsSpare association. Once the failover has occurred, the SpareGroup and the Redundancy Component and ActsAsSpare associations will be updated with current status. For example, the ActsAsSpare association that contained the FailoverTo Element will be deleted and a new RedundancyComponent association instantiated in its place. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param FailoverFrom The primary ManagedSystemElement that will become inactive after the method.
	 * @param FailoverTo The ManagedSystemElement that will take over from the primary MSE.
	 * <!-- end-model-doc -->
	 * @model FailoverFromAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" FailoverToAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_RedundancySet.FailOver()\"]'"
	 * @generated
	 */
	Long Failover(CIM_ManagedSystemElement FailoverFrom, CIM_ManagedSystemElement FailoverTo);

} // CIM_SpareGroup
