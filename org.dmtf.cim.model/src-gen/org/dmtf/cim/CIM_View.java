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
 * A representation of the model object '<em><b>CIM View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * View is an abstract class that provides a common superclass for classes providing de-normalized, aggregate representations of managed resources. The definition of each sub-class will include properties propagated from the the graph of classes that are used to model the resource in the normalized view. The classes may be resource classes or associations. The definition of how a value is propagated (i.e. source class and value transformations) is required to be specified. 
 * Sub-classes may be explicitly constrained to be read only. If a sub-class is not constrained as read only, the designers are strongly encouraged to carefully consider the data synchronization and consistencies issues that may result. The ElementView association may be used to find the instances that form the normalized view of the managed resource.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_View()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.26.0' UMLPackagePath='CIM::Core::CoreElements'"
 * @generated
 */
@ProviderType
public interface CIM_View extends CIM_ManagedElement {
} // CIM_View
