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
 * A representation of the model object '<em><b>CIM Product Service Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that the referenced Service is acquired as part of a Product. Examples of Services that may be acquired are outsourced storage and networking services, or support and warranty services. Expanding on the examples, Services represent generic functionality - so, it is possible to model the existence of storage volume management or warranty services as individual instances of subclasses of CIM_Service. These 'Services' may be enabled/disabled, started/stopped, signal an error, etc. (They behave as standard ManagedSystemElements.) Specific requests against the Services - for example, a request for warranty service or increased storage space - are NOT new instances of Service, but may be requested via the methods of the Service subclass, or be instantiated as specific subclasses of ManagedElement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductServiceComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Core::ProductFRU' override.GroupComponent='CIM_Product REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The Product.' override.PartComponent='CIM_Service REF' override.PartComponent.Description='The Service which is a part of the Product.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ProductServiceComponent extends CIM_Component {
} // CIM_ProductServiceComponent
