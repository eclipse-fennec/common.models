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
 * A representation of the model object '<em><b>CIM Elements Linked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ElementsLinked association indicates which Physical Elements are cabled together by a PhysicalLink.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementsLinked()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Link' override.Antecedent='CIM_PhysicalLink REF' override.Antecedent.Description='The PhysicalLink.' override.Dependent='CIM_PhysicalElement REF' override.Dependent.Description='The PhysicalElement that is linked.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementsLinked extends CIM_Dependency {
} // CIM_ElementsLinked
