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
 * A representation of the model object '<em><b>CIM Component CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ComputerSystem can aggregate another ComputerSystem. This association can be used to model MPP Systems with workstation frontends, an I2O subsystem embedded in a Unitary ComputerSystem, or a System that splits functionality between two processors, potentially running different Operating Systems. For example, if a CISC Processor and its associated OperatingSystem, are used for user interface and file support, and a RISC Processor and its OS are used for complex mathematical operations, this could be modeled as two ComputerSystems where one aggregates the other. In some cases, this could be modeled as a Cluster. The difference is the focus of the relationship. ComponentCS represents that unique and distinct ComputerSystems are aggregated by a higher level CS object. However, each of the component CSs are still distinguishable entities and are only viewed as such. Alternately, with a Cluster, the ComputerSystems that participate in it are inconsequential, when viewed through the 'Cluster System'. 
 * 
 * When instantiating or subclassing the ComponentCS relationship, care should be taken that the component ComputerSystem meets the definitional requirements of a ComputerSystem - ie, a functional whole that provides compute capabilities and aggregates System Devices, an OperatingSystem, etc.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComponentCS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.13.0' UMLPackagePath='CIM::System::SystemElements' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The ComputerSystem that contains and/or aggregates other Systems.' override.PartComponent='CIM_ComputerSystem REF' override.PartComponent.Description='The contained (Sub)ComputerSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ComponentCS extends CIM_SystemComponent {
} // CIM_ComponentCS
