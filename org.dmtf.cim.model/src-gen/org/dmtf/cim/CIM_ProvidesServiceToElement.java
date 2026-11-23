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
 * A representation of the model object '<em><b>CIM Provides Service To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_ProvidesServiceToElement class has been deprecated. Instead, ServiceAvailableToElement conveys the semantics of use, while the subclasses of ProvidesServiceToElement (or the ConcreteDependency association) describe dependency relationships. CIM_ProvidesServiceToElement was meant to generalize the ServiceServiceDependency association. This method indicates that ManagedElements can use the functionality provided by one or more Services. An example of the association is that a Processor and an enclosure (a PhysicalElement) can use AlertOnLAN Services to signal an incomplete or erroneous boot. In reality, AlertOnLAN is simply a HostedService on a computer system that is generally available for use and is not a dependency of the processor or enclosure. To describe that the use of the service might be restricted or have limited availability or applicability, the CIM_ServiceAvailableToElement association would be instantiated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProvidesServiceToElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAvailableToElement\"]' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_Service REF' override.Antecedent.Deprecated='[\"CIM_ServiceAvailableToElement.ServiceProvided\"]' override.Antecedent.Description='Note: The use of this element is deprecated. Deprecated description: The Service provided.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Deprecated='[\"CIM_ServiceAvailableToElement.UserOfService\"]' override.Dependent.Description='Note: The use of this element is deprecated. Deprecated description: The ManagedElement that is dependent on the Service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProvidesServiceToElement extends CIM_Dependency {
} // CIM_ProvidesServiceToElement
