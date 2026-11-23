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
 * A representation of the model object '<em><b>CIM Packaged Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Component is typically contained by a PhysicalPackage, such as a Chassis or Card. The PackagedComponent association makes this relationship explicit. In the first sentence, the word, 'typically', is used. This is because a Component may be removed from, or not yet inserted into, its containing Package (ie, the Removable boolean is TRUE). Therefore, a Component may not always be associated with a container.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackagedComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Component' override.GroupComponent='CIM_PhysicalPackage REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The PhysicalPackage that contains Component(s).' override.PartComponent='CIM_PhysicalComponent REF' override.PartComponent.Description='The PhysicalComponent which is contained in the Package.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PackagedComponent extends CIM_Container {
} // CIM_PackagedComponent
